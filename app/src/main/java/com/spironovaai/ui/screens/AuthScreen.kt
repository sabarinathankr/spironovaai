package com.spironovaai.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spironovaai.R
import com.spironovaai.ui.MyButton
import com.spironovaai.ui.MyEditText
import com.spironovaai.ui.MyText

@Preview(showBackground = false)
@Composable
fun AuthPreview() {
    AuthScreen()
}

@Composable
fun AuthScreen() {

    var emailText by remember { mutableStateOf(TextFieldValue("")) }

    var pwdText by remember { mutableStateOf(TextFieldValue("")) }
    Box(
        modifier = Modifier
            .background(colorResource(R.color.app_bg))
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Column(modifier = Modifier.align(Alignment.Center)) {
            MyEditText(
                modifier = Modifier
                    .fillMaxWidth()
                    /*.height(50.dp)*/
                    .background(
                        color = colorResource(R.color.white),
                        shape = RoundedCornerShape(16.dp)
                    )

                    .clip(RoundedCornerShape(16.dp)),
                text = emailText,
                hint = "Email",
                onTextChange = {
                    emailText = it
                })
            Spacer(Modifier.height(20.dp))
            MyEditText(
                modifier = Modifier
                    .fillMaxWidth()
                    /*.height(50.dp)*/
                    .background(
                        color = colorResource(R.color.white),
                        shape = RoundedCornerShape(16.dp)
                    )

                    .clip(RoundedCornerShape(16.dp)),
                text = pwdText,
                hint = "Password",
                onTextChange = {
                    pwdText = it
                })
            Spacer(Modifier.height(20.dp))

            MyButton(
                btnModifier = Modifier.fillMaxWidth(), modifier = Modifier.background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF0059D4),
                            colorResource(R.color.color_primary)
                        )
                    ),
                    shape = RoundedCornerShape(26.dp)
                ), {}, "Verify"
            )

            MyText(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 30.dp),
                text = "- OR -",
                fontSize = 12,
                textColor = colorResource(R.color.text_sub_clr)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            ) {
                IconButton(onClick = {}, modifier = Modifier.align(Alignment.Center)) {
                    // 🔹 Vector background image
                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.google_icon),
                        contentDescription = "Google",
                        contentScale = ContentScale.FillBounds,
                        colorFilter = ColorFilter.tint(colorResource(R.color.text_main_clr))

                    )
                }
            }
        }

        MyText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp)
                .align(Alignment.BottomEnd),
            text = "Don't have account! click here to Register",
            fontSize = 15,
            textColor = colorResource(R.color.text_main_clr)
        )
    }

}


