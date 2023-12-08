package com.example.healthcare

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthcare.Key.Companion.DB_USERS
import com.example.healthcare.databinding.ActivityLoginBinding
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class LoginActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth
        db = Firebase.database.reference

        binding.apply {

            btnSignUp.setOnClickListener {
                // 회원 가입
                auth.createUserWithEmailAndPassword(etvEmail.text.toString(), etvPw.text.toString())
                    .addOnCompleteListener(this@LoginActivity) { task ->
                        if (task.isSuccessful) {
                            tvContent.text =  "${auth.currentUser} 님 가입을 축하드립니다."
                        } else {
                            Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT,).show()
                        }
                    }

            }

            btnSignIn.setOnClickListener {
                // 로그인
                auth.signInWithEmailAndPassword(etvEmail.text.toString(), etvPw.text.toString())
                    .addOnCompleteListener(this@LoginActivity) { task ->
                        if (task.isSuccessful) {
                            // 1. db에 User 추가
                            //db.child(DB_USERS).child("userId").setValue(auth.currentUser.toString())



                            // 2. 메인 엑티비티로 이동
                            Toast.makeText(baseContext, "로그인 성공", Toast.LENGTH_SHORT,).show()
                            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                            finish()

                        } else {
                            Toast.makeText(baseContext, "로그인 실패", Toast.LENGTH_SHORT,).show()
                        }
                    }
            }

        }

    }

}
