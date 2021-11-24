package com.example.myapplication1_2


        import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.util.Log


        class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)


                Log.d("MainAtivity","${multiplying(100, 1000)}")
            }
            fun multiplying(number1:Int , number2: Int) {
                var multip = number1 * number2
                if (number1 == 100 && number2 == 1000) {
                    println("number1 and number2 $multip .")
                }
                else {
                    println(" I don't know an Answer")
                    print("good bye")


                }
            }


    }
