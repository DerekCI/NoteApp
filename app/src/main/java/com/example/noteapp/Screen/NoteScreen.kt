package com.example.noteapp.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.noteapp.Components.NoteButton
import com.example.noteapp.Components.NoteInputText
import com.example.noteapp.R


@ExperimentalComposeUiApi
@Composable
fun NoteScreen(){
    var title by remember{
        mutableStateOf("")
    }
    var description by remember{
        mutableStateOf("")
    }
    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(title = {
                          Text(text = stringResource(id = R.string.app_name))
        },
            actions = {
                Icon(imageVector = Icons.Rounded.Notifications, contentDescription = "Icon")
            },
                backgroundColor = Color(0xFFDADFE3))

        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            NoteInputText(text = title, label = "Title",
                onTextChange = {})
            NoteInputText(text = description, label ="Add note" ,
                onTextChange = {})
            NoteButton(text = "Save", onClick = {  })
        }

    }
}

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun NoteScreenPreview(){
    NoteScreen()
}