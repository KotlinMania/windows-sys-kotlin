@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemRemotemanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(commandhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(operationhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCloseSession(session: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCloseShell(shellhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManConnectShell(session: Long, flags: Int, resourceuri: Long, shellid: Long, options: Long, connectxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(shell: Long, flags: Int, commandid: Long, options: Long, connectxml: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCreateSession(apihandle: Long, connection: Long, flags: Int, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCreateShell(session: Long, flags: Int, resourceuri: Long, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(session: Long, flags: Int, resourceuri: Long, shellid: Long, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(apihandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(shell: Long, flags: Int, disconnectinfo: Long, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(apihandle: Long, flags: Int, languagecode: Long, errorcode: Int, messagelength: Int, message: Long, messagelengthused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(session: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(session: Long, option: Int, stringlength: Int, string: Long, stringlengthused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManInitialize(flags: Int, apihandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete(senderdetails: Long, flags: Int, userauthorizationcontext: Long, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: Int, quota: Long, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete(senderdetails: Long, flags: Int, userauthorizationcontext: Long, impersonationtoken: Long, userisadministrator: Int, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails(requestdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration(plugincontext: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters(requestdetails: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete(requestdetails: Long, flags: Int, errorcode: Int, extendedinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult(requestdetails: Long, flags: Int, stream: Long, streamresult: Long, commandstate: Long, exitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion(plugincontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext(requestdetails: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(shell: Long, command: Long, flags: Int, desiredstreamset: Long, async: Long, receiveoperation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(shell: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(commandhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(shell: Long, flags: Int, commandline: Long, args: Long, options: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(shell: Long, flags: Int, commandid: Long, commandline: Long, args: Long, options: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(shell: Long, command: Long, flags: Int, streamid: Long, streamdata: Long, endofstream: Int, async: Long, sendoperation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(session: Long, option: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_wSManSignalShell(shell: Long, command: Long, flags: Int, code: Long, async: Long, signaloperation: Long)
}

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(commandhandle, flags.toInt(), (async?.value ?: 0L))
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(operationhandle, flags.toInt()).toUInt()

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCloseSession(session, flags.toInt()).toUInt()

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCloseShell(shellhandle, flags.toInt(), (async?.value ?: 0L))
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManConnectShell(session, flags.toInt(), (resourceuri?.value ?: 0L), (shellid?.value ?: 0L), (options?.value ?: 0L), (connectxml?.value ?: 0L), (async?.value ?: 0L), (shell?.value ?: 0L))
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(shell, flags.toInt(), (commandid?.value ?: 0L), (options?.value ?: 0L), (connectxml?.value ?: 0L), (async?.value ?: 0L), (command?.value ?: 0L))
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: COpaquePointer?, proxyinfo: COpaquePointer?, session: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCreateSession(apihandle, (connection?.value ?: 0L), flags.toInt(), (serverauthenticationcredentials?.value ?: 0L), (proxyinfo?.value ?: 0L), (session?.value ?: 0L)).toUInt()

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCreateShell(session, flags.toInt(), (resourceuri?.value ?: 0L), (startupinfo?.value ?: 0L), (options?.value ?: 0L), (createxml?.value ?: 0L), (async?.value ?: 0L), (shell?.value ?: 0L))
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(session, flags.toInt(), (resourceuri?.value ?: 0L), (shellid?.value ?: 0L), (startupinfo?.value ?: 0L), (options?.value ?: 0L), (createxml?.value ?: 0L), (async?.value ?: 0L), (shell?.value ?: 0L))
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(apihandle, flags.toInt()).toUInt()

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: COpaquePointer?, async: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(shell, flags.toInt(), (disconnectinfo?.value ?: 0L), (async?.value ?: 0L))
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(apihandle, flags.toInt(), (languagecode?.value ?: 0L), errorcode.toInt(), messagelength.toInt(), (message?.value ?: 0L), (messagelengthused?.value ?: 0L)).toUInt()

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(session, option, (value?.value ?: 0L)).toUInt()

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(session, option, stringlength.toInt(), (string?.value ?: 0L), (stringlengthused?.value ?: 0L)).toUInt()

public actual fun wSManInitialize(flags: UInt, apihandle: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManInitialize(flags.toInt(), (apihandle?.value ?: 0L)).toUInt()

public actual fun wSManPluginAuthzOperationComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete((senderdetails?.value ?: 0L), flags.toInt(), (userauthorizationcontext?.value ?: 0L), errorcode.toInt(), (extendederrorinformation?.value ?: 0L)).toUInt()

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: COpaquePointer?, flags: UInt, quota: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete((senderdetails?.value ?: 0L), flags.toInt(), (quota?.value ?: 0L), errorcode.toInt(), (extendederrorinformation?.value ?: 0L)).toUInt()

public actual fun wSManPluginAuthzUserComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete((senderdetails?.value ?: 0L), flags.toInt(), (userauthorizationcontext?.value ?: 0L), (impersonationtoken?.value ?: 0L), userisadministrator, errorcode.toInt(), (extendederrorinformation?.value ?: 0L)).toUInt()

public actual fun wSManPluginFreeRequestDetails(requestdetails: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails((requestdetails?.value ?: 0L)).toUInt()

public actual fun wSManPluginGetConfiguration(plugincontext: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration((plugincontext?.value ?: 0L), flags.toInt(), (data?.value ?: 0L)).toUInt()

public actual fun wSManPluginGetOperationParameters(requestdetails: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters((requestdetails?.value ?: 0L), flags.toInt(), (data?.value ?: 0L)).toUInt()

public actual fun wSManPluginOperationComplete(requestdetails: COpaquePointer?, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete((requestdetails?.value ?: 0L), flags.toInt(), errorcode.toInt(), (extendedinformation?.value ?: 0L)).toUInt()

public actual fun wSManPluginReceiveResult(requestdetails: COpaquePointer?, flags: UInt, stream: Pcwstr, streamresult: COpaquePointer?, commandstate: Pcwstr, exitcode: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult((requestdetails?.value ?: 0L), flags.toInt(), (stream?.value ?: 0L), (streamresult?.value ?: 0L), (commandstate?.value ?: 0L), exitcode.toInt()).toUInt()

public actual fun wSManPluginReportCompletion(plugincontext: COpaquePointer?, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion((plugincontext?.value ?: 0L), flags.toInt()).toUInt()

public actual fun wSManPluginReportContext(requestdetails: COpaquePointer?, flags: UInt, context: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext((requestdetails?.value ?: 0L), flags.toInt(), (context?.value ?: 0L)).toUInt()

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: COpaquePointer?, async: COpaquePointer?, receiveoperation: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(shell, command, flags.toInt(), (desiredstreamset?.value ?: 0L), (async?.value ?: 0L), (receiveoperation?.value ?: 0L))
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(shell, flags.toInt(), (async?.value ?: 0L))
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(commandhandle, flags.toInt(), (async?.value ?: 0L))
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(shell, flags.toInt(), (commandline?.value ?: 0L), (args?.value ?: 0L), (options?.value ?: 0L), (async?.value ?: 0L), (command?.value ?: 0L))
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(shell, flags.toInt(), (commandid?.value ?: 0L), (commandline?.value ?: 0L), (args?.value ?: 0L), (options?.value ?: 0L), (async?.value ?: 0L), (command?.value ?: 0L))
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: COpaquePointer?, endofstream: Bool, async: COpaquePointer?, sendoperation: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(shell, command, flags.toInt(), (streamid?.value ?: 0L), (streamdata?.value ?: 0L), endofstream, (async?.value ?: 0L), (sendoperation?.value ?: 0L))
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: COpaquePointer?): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(session, option, (data?.value ?: 0L)).toUInt()

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: COpaquePointer?, signaloperation: COpaquePointer?) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_wSManSignalShell(shell, command, flags.toInt(), (code?.value ?: 0L), (async?.value ?: 0L), (signaloperation?.value ?: 0L))
}
