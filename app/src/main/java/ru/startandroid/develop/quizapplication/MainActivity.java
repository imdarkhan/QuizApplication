package ru.startandroid.develop.quizapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Переменные для кнопок
    private Button choice1;
    private Button choice2;
    private Button choice3;

    // Ответ на вопрос
    private final String result = "New York";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация кнопок после setContentView
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);

        // Обработчики нажатий для кнопок
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleAnswer(choice1.getText().toString());
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleAnswer(choice2.getText().toString());
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleAnswer(choice3.getText().toString());
            }
        });
    }

    // Метод для проверки ответа
    private void handleAnswer(String userAnswer) {
        if (userAnswer.equals(result)) {
            showToastMessage(true);
        } else {
            showToastMessage(false);
        }
    }

    // Метод для отображения сообщения
    private void showToastMessage(boolean isCorrect) {
        String message = isCorrect ? "Дұрыс" : "Дұрыс емес";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
