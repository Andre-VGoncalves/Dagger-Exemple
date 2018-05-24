package org.loop.example

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Mensagem @Inject constructor(var msg: String, @ForApplication var context: Context) {


    fun provideMensagem(): String = msg

}