@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private object WindowsWin32SystemPipesJniBridge {
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
        val stream = WindowsWin32SystemPipesJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemPipesCallNamedPipeA(lpnamedpipename: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesCallNamedPipeW(lpnamedpipename: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesConnectNamedPipe(hnamedpipe: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesCreateNamedPipeA(lpname: Long, dwopenmode: Int, dwpipemode: Int, nmaxinstances: Int, noutbuffersize: Int, ninbuffersize: Int, ndefaulttimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesCreateNamedPipeW(lpname: Long, dwopenmode: Int, dwpipemode: Int, nmaxinstances: Int, noutbuffersize: Int, ninbuffersize: Int, ndefaulttimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesCreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesDisconnectNamedPipe(hnamedpipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(pipe: Long, clientcomputername: Long, clientcomputernamelength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(pipe: Long, clientcomputername: Long, clientcomputernamelength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(pipe: Long, clientprocessid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(pipe: Long, clientsessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(hnamedpipe: Long, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: Long, nmaxusernamesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(hnamedpipe: Long, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: Long, nmaxusernamesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeInfo(hnamedpipe: Long, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(pipe: Long, serverprocessid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(pipe: Long, serversessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(hnamedpipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesPeekNamedPipe(hnamedpipe: Long, lpbuffer: Long, nbuffersize: Int, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(hnamedpipe: Long, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesTransactNamedPipe(hnamedpipe: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesWaitNamedPipeA(lpnamedpipename: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPipesWaitNamedPipeW(lpnamedpipename: Long, ntimeout: Int): Int
}

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesCallNamedPipeA(lpnamedpipename.rawAddress, lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesread.rawAddress, ntimeout.toInt())

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesCallNamedPipeW(lpnamedpipename.rawAddress, lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesread.rawAddress, ntimeout.toInt())

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesConnectNamedPipe(hnamedpipe.rawAddress, lpoverlapped.rawAddress)

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesCreateNamedPipeA(lpname.rawAddress, dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.rawAddress))

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesCreateNamedPipeW(lpname.rawAddress, dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.rawAddress))

public actual fun createPipe(hreadpipe: MutPtr<Handle>, hwritepipe: MutPtr<Handle>, lppipeattributes: ConstPtr<SecurityAttributes>, nsize: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesCreatePipe(hreadpipe.rawAddress, hwritepipe.rawAddress, lppipeattributes.rawAddress, nsize.toInt())

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesDisconnectNamedPipe(hnamedpipe.rawAddress)

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(pipe.rawAddress, clientcomputername.rawAddress, clientcomputernamelength.toInt())

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(pipe.rawAddress, clientcomputername.rawAddress, clientcomputernamelength.toInt())

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(pipe.rawAddress, clientprocessid.rawAddress)

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(pipe.rawAddress, clientsessionid.rawAddress)

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(hnamedpipe.rawAddress, lpstate.rawAddress, lpcurinstances.rawAddress, lpmaxcollectioncount.rawAddress, lpcollectdatatimeout.rawAddress, lpusername.rawAddress, nmaxusernamesize.toInt())

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(hnamedpipe.rawAddress, lpstate.rawAddress, lpcurinstances.rawAddress, lpmaxcollectioncount.rawAddress, lpcollectdatatimeout.rawAddress, lpusername.rawAddress, nmaxusernamesize.toInt())

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr<NamedPipeMode>, lpoutbuffersize: MutPtr<UInt>, lpinbuffersize: MutPtr<UInt>, lpmaxinstances: MutPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeInfo(hnamedpipe.rawAddress, lpflags.rawAddress, lpoutbuffersize.rawAddress, lpinbuffersize.rawAddress, lpmaxinstances.rawAddress)

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(pipe.rawAddress, serverprocessid.rawAddress)

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(pipe.rawAddress, serversessionid.rawAddress)

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(hnamedpipe.rawAddress)

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr<CVoid>, nbuffersize: UInt, lpbytesread: MutPtr<UInt>, lptotalbytesavail: MutPtr<UInt>, lpbytesleftthismessage: MutPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesPeekNamedPipe(hnamedpipe.rawAddress, lpbuffer.rawAddress, nbuffersize.toInt(), lpbytesread.rawAddress, lptotalbytesavail.rawAddress, lpbytesleftthismessage.rawAddress)

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr<NamedPipeMode>, lpmaxcollectioncount: ConstPtr<UInt>, lpcollectdatatimeout: ConstPtr<UInt>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(hnamedpipe.rawAddress, lpmode.rawAddress, lpmaxcollectioncount.rawAddress, lpcollectdatatimeout.rawAddress)

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesTransactNamedPipe(hnamedpipe.rawAddress, lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesread.rawAddress, lpoverlapped.rawAddress)

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesWaitNamedPipeA(lpnamedpipename.rawAddress, ntimeout.toInt())

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssysWindowsWin32SystemPipesWaitNamedPipeW(lpnamedpipename.rawAddress, ntimeout.toInt())
