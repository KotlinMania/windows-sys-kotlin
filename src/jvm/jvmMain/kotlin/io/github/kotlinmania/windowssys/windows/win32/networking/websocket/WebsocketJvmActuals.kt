@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

private object WindowsWin32NetworkingWebsocketJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkingWebsocketJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket: Long, pszsubprotocols: Long, ulsubprotocolcount: Int, pszextensions: Long, ulextensioncount: Int, pinitialheaders: Long, ulinitialheadercount: Int, padditionalheaders: Long, puladditionalheadercount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket: Long, pszsubprotocolselected: Long, pszextensionselected: Long, ulextensionselectedcount: Int, prequestheaders: Long, ulrequestheadercount: Int, presponseheaders: Long, pulresponseheadercount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket: Long, pvactioncontext: Long, ulbytestransferred: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket: Long, presponseheaders: Long, ulreponseheadercount: Int, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket: Long, eactionqueue: Int, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype: Int, pvvalue: Long, ulsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket: Long, pbuffer: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket: Long, buffertype: Int, pbuffer: Long, context: Long): Int
}

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket.rawAddress)
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr, ulsubprotocolcount: UInt, pszextensions: ConstPtr, ulextensioncount: UInt, pinitialheaders: ConstPtr, ulinitialheadercount: UInt, padditionalheaders: MutPtr, puladditionalheadercount: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket.rawAddress, pszsubprotocols.rawAddress, ulsubprotocolcount.toInt(), pszextensions.rawAddress, ulextensioncount.toInt(), pinitialheaders.rawAddress, ulinitialheadercount.toInt(), padditionalheaders.rawAddress, puladditionalheadercount.rawAddress)

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr, ulextensionselectedcount: UInt, prequestheaders: ConstPtr, ulrequestheadercount: UInt, presponseheaders: MutPtr, pulresponseheadercount: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket.rawAddress, pszsubprotocolselected.rawAddress, pszextensionselected.rawAddress, ulextensionselectedcount.toInt(), prequestheaders.rawAddress, ulrequestheadercount.toInt(), presponseheaders.rawAddress, pulresponseheadercount.rawAddress)

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr, ulbytestransferred: UInt) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket.rawAddress, pvactioncontext.rawAddress, ulbytestransferred.toInt())
}

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr, ulpropertycount: UInt, phwebsocket: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties.rawAddress, ulpropertycount.toInt(), phwebsocket.rawAddress)

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr, ulpropertycount: UInt, phwebsocket: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties.rawAddress, ulpropertycount.toInt(), phwebsocket.rawAddress)

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket.rawAddress)
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr, ulreponseheadercount: UInt, pulselectedextensions: MutPtr, pulselectedextensioncount: MutPtr, pulselectedsubprotocol: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket.rawAddress, presponseheaders.rawAddress, ulreponseheadercount.toInt(), pulselectedextensions.rawAddress, pulselectedextensioncount.rawAddress, pulselectedsubprotocol.rawAddress)

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket.rawAddress)

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr, puldatabuffercount: MutPtr, paction: MutPtr, pbuffertype: MutPtr, pvapplicationcontext: MutPtr, pvactioncontext: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket.rawAddress, eactionqueue, pdatabuffers.rawAddress, puldatabuffercount.rawAddress, paction.rawAddress, pbuffertype.rawAddress, pvapplicationcontext.rawAddress, pvactioncontext.rawAddress)

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr, ulsize: MutPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype, pvvalue.rawAddress, ulsize.rawAddress)

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr, pvcontext: ConstPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket.rawAddress, pbuffer.rawAddress, pvcontext.rawAddress)

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr, context: ConstPtr): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket.rawAddress, buffertype, pbuffer.rawAddress, context.rawAddress)
