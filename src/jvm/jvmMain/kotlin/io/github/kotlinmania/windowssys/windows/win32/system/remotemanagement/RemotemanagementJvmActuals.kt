@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemRemotemanagementJniBridge {
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
        val stream = WindowsWin32SystemRemotemanagementJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(commandhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(shellhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(session: Long, flags: Int, resourceuri: Long, shellid: Long, options: Long, connectxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(shell: Long, flags: Int, commandid: Long, options: Long, connectxml: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(apihandle: Long, connection: Long, flags: Int, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(session: Long, flags: Int, resourceuri: Long, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(session: Long, flags: Int, resourceuri: Long, shellid: Long, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(shell: Long, flags: Int, disconnectinfo: Long, async: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(apihandle: Long, flags: Int, languagecode: Long, errorcode: Int, messagelength: Int, message: Long, messagelengthused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(session: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(session: Long, option: Int, stringlength: Int, string: Long, stringlengthused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManInitialize(flags: Int, apihandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(senderdetails: Long, flags: Int, userauthorizationcontext: Long, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: Int, quota: Long, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(senderdetails: Long, flags: Int, userauthorizationcontext: Long, impersonationtoken: Long, userisadministrator: Int, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(requestdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(plugincontext: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(requestdetails: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(requestdetails: Long, flags: Int, errorcode: Int, extendedinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(requestdetails: Long, flags: Int, stream: Long, streamresult: Long, commandstate: Long, exitcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(plugincontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(requestdetails: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(shell: Long, command: Long, flags: Int, desiredstreamset: Long, async: Long, receiveoperation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(shell: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(commandhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(shell: Long, flags: Int, commandline: Long, args: Long, options: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(shell: Long, flags: Int, commandid: Long, commandline: Long, args: Long, options: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(shell: Long, command: Long, flags: Int, streamid: Long, streamdata: Long, endofstream: Int, async: Long, sendoperation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(session: Long, option: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(shell: Long, command: Long, flags: Int, code: Long, async: Long, signaloperation: Long)
}

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(commandhandle, flags.toInt(), async.rawAddress)
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle, flags.toInt()).toUInt()

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session, flags.toInt()).toUInt()

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(shellhandle, flags.toInt(), async.rawAddress)
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(session, flags.toInt(), resourceuri.rawAddress, shellid.rawAddress, options.rawAddress, connectxml.rawAddress, async.rawAddress, shell.rawAddress)
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, command: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(shell, flags.toInt(), commandid.rawAddress, options.rawAddress, connectxml.rawAddress, async.rawAddress, command.rawAddress)
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr, proxyinfo: ConstPtr, session: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(apihandle, connection.rawAddress, flags.toInt(), serverauthenticationcredentials.rawAddress, proxyinfo.rawAddress, session.rawAddress).toUInt()

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(session, flags.toInt(), resourceuri.rawAddress, startupinfo.rawAddress, options.rawAddress, createxml.rawAddress, async.rawAddress, shell.rawAddress)
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(session, flags.toInt(), resourceuri.rawAddress, shellid.rawAddress, startupinfo.rawAddress, options.rawAddress, createxml.rawAddress, async.rawAddress, shell.rawAddress)
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle, flags.toInt()).toUInt()

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr, async: ConstPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(shell, flags.toInt(), disconnectinfo.rawAddress, async.rawAddress)
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(apihandle, flags.toInt(), languagecode.rawAddress, errorcode.toInt(), messagelength.toInt(), message.rawAddress, messagelengthused.rawAddress).toUInt()

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(session, option, value.rawAddress).toUInt()

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(session, option, stringlength.toInt(), string.rawAddress, stringlengthused.rawAddress).toUInt()

public actual fun wSManInitialize(flags: UInt, apihandle: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManInitialize(flags.toInt(), apihandle.rawAddress).toUInt()

public actual fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(senderdetails.rawAddress, flags.toInt(), userauthorizationcontext.rawAddress, errorcode.toInt(), extendederrorinformation.rawAddress).toUInt()

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr, flags: UInt, quota: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(senderdetails.rawAddress, flags.toInt(), quota.rawAddress, errorcode.toInt(), extendederrorinformation.rawAddress).toUInt()

public actual fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(senderdetails.rawAddress, flags.toInt(), userauthorizationcontext.rawAddress, impersonationtoken.rawAddress, userisadministrator, errorcode.toInt(), extendederrorinformation.rawAddress).toUInt()

public actual fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(requestdetails.rawAddress).toUInt()

public actual fun wSManPluginGetConfiguration(plugincontext: ConstPtr, flags: UInt, data: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(plugincontext.rawAddress, flags.toInt(), data.rawAddress).toUInt()

public actual fun wSManPluginGetOperationParameters(requestdetails: ConstPtr, flags: UInt, data: MutPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(requestdetails.rawAddress, flags.toInt(), data.rawAddress).toUInt()

public actual fun wSManPluginOperationComplete(requestdetails: ConstPtr, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(requestdetails.rawAddress, flags.toInt(), errorcode.toInt(), extendedinformation.rawAddress).toUInt()

public actual fun wSManPluginReceiveResult(requestdetails: ConstPtr, flags: UInt, stream: Pcwstr, streamresult: ConstPtr, commandstate: Pcwstr, exitcode: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(requestdetails.rawAddress, flags.toInt(), stream.rawAddress, streamresult.rawAddress, commandstate.rawAddress, exitcode.toInt()).toUInt()

public actual fun wSManPluginReportCompletion(plugincontext: ConstPtr, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(plugincontext.rawAddress, flags.toInt()).toUInt()

public actual fun wSManPluginReportContext(requestdetails: ConstPtr, flags: UInt, context: ConstPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(requestdetails.rawAddress, flags.toInt(), context.rawAddress).toUInt()

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr, async: ConstPtr, receiveoperation: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(shell, command, flags.toInt(), desiredstreamset.rawAddress, async.rawAddress, receiveoperation.rawAddress)
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(shell, flags.toInt(), async.rawAddress)
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(commandhandle, flags.toInt(), async.rawAddress)
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(shell, flags.toInt(), commandline.rawAddress, args.rawAddress, options.rawAddress, async.rawAddress, command.rawAddress)
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(shell, flags.toInt(), commandid.rawAddress, commandline.rawAddress, args.rawAddress, options.rawAddress, async.rawAddress, command.rawAddress)
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr, endofstream: Bool, async: ConstPtr, sendoperation: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(shell, command, flags.toInt(), streamid.rawAddress, streamdata.rawAddress, endofstream, async.rawAddress, sendoperation.rawAddress)
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(session, option, data.rawAddress).toUInt()

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr, signaloperation: MutPtr) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(shell, command, flags.toInt(), code.rawAddress, async.rawAddress, signaloperation.rawAddress)
}
