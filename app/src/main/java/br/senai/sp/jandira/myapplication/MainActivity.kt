package br.senai.sp.jandira.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myapplication.ui.theme.MyApplicationTheme

class MainActviity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    telalogin()
                    telaEntrar()
                    homePage()
                }
            }
        }
    }
}

@Composable
fun telalogin() {

    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {

        }
    }

    Column(
        modifier = Modifier.padding(top = 160.dp, start = 16.dp)
    ) {
        Text(
            text = "Login",
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Por favor entre para continuar.",
            color = Color(0xffA09C9C)
        )


        Column(
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, top = 70.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )


                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),

                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, bottom = 16.dp, top = 16.dp),
                label = { Text(text = "Senha") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )


                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),
                    )
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0XFFCF06F0)
                ),
            modifier = Modifier
                .align(Alignment.End)
                .padding(bottom = 32.dp, end = 16.dp),
            shape = RoundedCornerShape(size = 8.dp)
        ) {
            Text(
                text = "Entrar",
                modifier = Modifier
                    .padding(12.dp)
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "",
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.End)
        ) {
            Text(
                text = "Não tem uma conta?",
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                        .padding(end = 10.dp, top = 9.dp)
            )
            Text(
                text = "Crie agora",
                color = Color(0xffCF06F0),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(start = 6.dp, top = 26.dp)

            )
        }
    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(topEnd = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {

        }
    }


}

@Composable
fun telaEntrar() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {

        }

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {
        Text(
            text = "Sign Up",
            color = Color(0xffCF06F0),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Create a new account",
            color = Color(0xffA09C9C),
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 25.dp)
        )
        Card(
            modifier = Modifier
                .size(height = 100.dp, width = 100.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFF123456)),
            shape = CircleShape
        ) {
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "imagem de perfil",
                modifier = Modifier
                    .size(height = 100.dp, width = 100.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.addusuario),
            contentDescription = "imagem de perfil",
            modifier = Modifier
                .offset(x = 60.dp, y = -26.dp)
                .size(height = 28.dp, width = 28.dp)
        )
        Column(
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Username") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),

                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Phone") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),

                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),

                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),

                        )
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 20.dp, top = 20.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RectangleShape,
                modifier = Modifier
                    .size(27.dp)
                    .border(1.dp, Color(0xffCF06F0))
                    .padding(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                )
            ) {
            }
            Text(text = "Over 18?", modifier = Modifier.padding(start = 12.dp))
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0XFFCF06F0)
                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 26.dp, end = 16.dp, top = 26.dp, bottom = 30.dp),
            shape = RoundedCornerShape(size = 8.dp)
        ) {
            Text(
                text = "CREATE ACCOUNT",
                modifier = Modifier
                    .padding(12.dp)
            )
        }
        Row(
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = "Already have an account?",
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Sign in",
                color = Color(0xffCF06F0),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(end = 16.dp)
            )
        }

    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(topEnd = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {

        }
    }
}

@Composable
fun homePage(){
    Column (
        modifier = Modifier
            .background(Color(0xFFEAEAF0))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            shape = RectangleShape
        )
        {
            Image(
                painter = painterResource(id = R.drawable.chile),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "Categories",
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp,
                    color = Color.Gray
                )
                LazyRow(modifier = Modifier.fillMaxWidth()){
                    items(2) {
                        Card (
                            modifier = Modifier
                                .padding(10.dp)
                                .height(60.dp)
                                .width(80.dp),
                            colors = CardDefaults
                                .cardColors(containerColor = Color(0xffCF06F0)
                                )
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.montanhas),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                text = "Montain",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                }

                Row (
                    modifier = Modifier.width(350.dp),
                    horizontalArrangement = Arrangement.Center
                ){
                    OutlinedTextField(value = "",
                        onValueChange ={},
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.White,
                            unfocusedBorderColor = Color.White
                        ),
                        trailingIcon = {

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Search,
                                    contentDescription = "Botao de Busca",
                                    tint = Color.Gray
                                )

                            }
                        },
                        placeholder = {
                            Text(
                                text ="Search your destiny",
                                color = Color.Gray)
                        }
                    )
                }

                Text(
                    text = "Past Trips",
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp,
                    color = Color.Gray
                )
            }
            LazyColumn (
                modifier = Modifier.fillMaxSize()
            ) {
                items(5){
                    Card (
                        modifier = Modifier
                            .padding(10.dp)
                            .height(150.dp)
                            .width(400.dp),
                        colors = CardDefaults
                            .cardColors(containerColor = Color.White
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(360.dp)
                                    .padding(top = 3.dp, start = 0.dp, end = 0.dp, bottom = 0.dp)
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.chile),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column (
                                modifier = Modifier.padding(start = 16.dp)
                            ){
                                Text(
                                    text = "London, 2019",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Magenta
                                )
                                Text(
                                    text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }

                        }
                    }
                }
            }

        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
        telalogin()
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    telaEntrar()
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    homePage()
}



