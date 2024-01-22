package com.example.brandnewchat.ui

import androidx.compose.runtime.Composable

enum class NotesAppScreen(){
    MainScreen,
    ChatScreen,
    ChatScreenTwo
}


@Composable
fun Navigation(
//    summarizeViewModel: SummarizeViewModel = viewModel(factory = AppViewModelProvider.Factory),
//    summarizeViewModel: SummarizeViewModel = AppViewModelProvider.Factory.create(SummarizeViewModel::class.java, context),
//    navController: NavHostController = rememberNavController()
) {
//    Scaffold { innerPaddingValues ->
////        val uiState by summarizeViewModel.uiState.collectAsState()
//        NavHost(
//            navController = navController,
//            startDestination = NotesAppScreen.MainScreen.name,
//            modifier = Modifier.padding(innerPaddingValues)
//        ) {
//            composable(route = NotesAppScreen.MainScreen.name) {
//                // Your composable content for the MainScreen
//                NoteApp(
////                    summarizeViewModel,
//                    onNextButtonClicked = { navController.navigate(NotesAppScreen.ChatScreen.name) },
//                    onNextButtonClickedTwo  = { navController.navigate(NotesAppScreen.ChatScreenTwo.name) }
//                )
//            }
//            composable(route= NotesAppScreen.ChatScreen.name){
//                SummarizeRoute(summarizeViewModel)
//            }
//            composable(route =  NotesAppScreen.ChatScreenTwo.name){
//                    ChatScreen(
//                        summarizeViewModel,
//                        messages = messagesRelistic) {
//
//                    }
//            }
//        }
//    }
}