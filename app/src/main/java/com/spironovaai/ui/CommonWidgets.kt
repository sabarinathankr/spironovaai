package com.spironovaai.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyText(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    fontWeight: FontWeight = FontWeight.W400,
    fontSize: Int,
    textColor: Color,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        modifier = modifier
            .then(
                Modifier.clickable(
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() }
                ) { onClick() }
            )
        /*.then(
            if (background != null)
                Modifier.background(background)
            else
                Modifier // ✅ transparent (no background)
        )*/,
        text = text,
        fontSize = fontSize.sp,
        color = textColor,
        textAlign = textAlign,
        fontWeight = fontWeight
    )
}

@Composable
fun NextButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit = {}) {

}

@Composable
fun MyButton(
    btnModifier: Modifier,
    modifier: Modifier,
    onClickButton: () -> Unit,
    buttonText: String,
    textColor: Color = Color(0xFFFFFFFF),
    fontSize: Int = 13,
    fontWeight: FontWeight = FontWeight.W400,
    /*fontFamily: Int = R.font.ostia_antica_regular,*/
) {
    Button(
        onClick = onClickButton,
        modifier = btnModifier
            .height(52.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent // 🔥 important
        ),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(26.dp)
    ) {
        Box(

            modifier = modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyText(
                onClick = onClickButton,
                text = buttonText,
                fontWeight = fontWeight,
                fontSize = fontSize,
                /*fontFamily = fontFamily,*/
                textColor = textColor
            )
        }
    }

}

@Composable
fun MyEditText(
    modifier: Modifier = Modifier,
    text: TextFieldValue,
    hint: String,
    onTextChange: (TextFieldValue) -> Unit,
) {
    TextField(
        modifier = modifier,
        value = text,
        onValueChange = { onTextChange(it) },

        placeholder = {                     // ✅ hint behavior
            Text(text = hint)
        },

        singleLine = true,

        colors = TextFieldDefaults.colors(   // ✅ remove underline
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,

            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent
        )
    )

}
