@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemRemotemanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCloseCommand(commandhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCloseOperation(operationhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCloseSession(session: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCloseShell(shellhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManConnectShell(session: Long, flags: Int, resourceuri: Long, shellid: Long, options: Long, connectxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand(shell: Long, flags: Int, commandid: Long, options: Long, connectxml: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCreateSession(apihandle: Long, connection: Long, flags: Int, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCreateShell(session: Long, flags: Int, resourceuri: Long, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx(session: Long, flags: Int, resourceuri: Long, shellid: Long, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManDeinitialize(apihandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell(shell: Long, flags: Int, disconnectinfo: Long, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage(apihandle: Long, flags: Int, languagecode: Long, errorcode: Int, messagelength: Int, message: Long, messagelengthused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword(session: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString(session: Long, option: Int, stringlength: Int, string: Long, stringlengthused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManInitialize(flags: Int, apihandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete(senderdetails: Long, flags: Int, userauthorizationcontext: Long, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: Int, quota: Long, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete(senderdetails: Long, flags: Int, userauthorizationcontext: Long, impersonationtoken: Long, userisadministrator: Int, errorcode: Int, extendederrorinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails(requestdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration(plugincontext: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters(requestdetails: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete(requestdetails: Long, flags: Int, errorcode: Int, extendedinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult(requestdetails: Long, flags: Int, stream: Long, streamresult: Long, commandstate: Long, exitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion(plugincontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext(requestdetails: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput(shell: Long, command: Long, flags: Int, desiredstreamset: Long, async: Long, receiveoperation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManReconnectShell(shell: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand(commandhandle: Long, flags: Int, async: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand(shell: Long, flags: Int, commandline: Long, args: Long, options: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx(shell: Long, flags: Int, commandid: Long, commandline: Long, args: Long, options: Long, async: Long, command: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManSendShellInput(shell: Long, command: Long, flags: Int, streamid: Long, streamdata: Long, endofstream: Int, async: Long, sendoperation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption(session: Long, option: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotemanagement_WSManSignalShell(shell: Long, command: Long, flags: Int, code: Long, async: Long, signaloperation: Long)
}

public actual fun WSManCloseCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCloseCommand(commandhandle, flags.toInt(), async)
}

public actual fun WSManCloseOperation(operationhandle: WSMAN_OPERATION_HANDLE, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCloseOperation(operationhandle, flags.toInt()).toUInt()

public actual fun WSManCloseSession(session: WSMAN_SESSION_HANDLE, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCloseSession(session, flags.toInt()).toUInt()

public actual fun WSManCloseShell(shellhandle: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCloseShell(shellhandle, flags.toInt(), async)
}

public actual fun WSManConnectShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, options: Long, connectxml: Long, async: Long, shell: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManConnectShell(session, flags.toInt(), resourceuri, shellid, options, connectxml, async, shell)
}

public actual fun WSManConnectShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, options: Long, connectxml: Long, async: Long, command: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand(shell, flags.toInt(), commandid, options, connectxml, async, command)
}

public actual fun WSManCreateSession(apihandle: WSMAN_API_HANDLE, connection: PCWSTR, flags: UInt, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCreateSession(apihandle, connection, flags.toInt(), serverauthenticationcredentials, proxyinfo, session).toUInt()

public actual fun WSManCreateShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCreateShell(session, flags.toInt(), resourceuri, startupinfo, options, createxml, async, shell)
}

public actual fun WSManCreateShellEx(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx(session, flags.toInt(), resourceuri, shellid, startupinfo, options, createxml, async, shell)
}

public actual fun WSManDeinitialize(apihandle: WSMAN_API_HANDLE, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManDeinitialize(apihandle, flags.toInt()).toUInt()

public actual fun WSManDisconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, disconnectinfo: Long, async: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell(shell, flags.toInt(), disconnectinfo, async)
}

public actual fun WSManGetErrorMessage(apihandle: WSMAN_API_HANDLE, flags: UInt, languagecode: PCWSTR, errorcode: UInt, messagelength: UInt, message: PWSTR, messagelengthused: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage(apihandle, flags.toInt(), languagecode, errorcode.toInt(), messagelength.toInt(), message, messagelengthused).toUInt()

public actual fun WSManGetSessionOptionAsDword(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, value: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword(session, option, value).toUInt()

public actual fun WSManGetSessionOptionAsString(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, stringlength: UInt, string: PWSTR, stringlengthused: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString(session, option, stringlength.toInt(), string, stringlengthused).toUInt()

public actual fun WSManInitialize(flags: UInt, apihandle: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManInitialize(flags.toInt(), apihandle).toUInt()

public actual fun WSManPluginAuthzOperationComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete(senderdetails, flags.toInt(), userauthorizationcontext, errorcode.toInt(), extendederrorinformation).toUInt()

public actual fun WSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: UInt, quota: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete(senderdetails, flags.toInt(), quota, errorcode.toInt(), extendederrorinformation).toUInt()

public actual fun WSManPluginAuthzUserComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, impersonationtoken: HANDLE, userisadministrator: BOOL, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete(senderdetails, flags.toInt(), userauthorizationcontext, impersonationtoken, userisadministrator, errorcode.toInt(), extendederrorinformation).toUInt()

public actual fun WSManPluginFreeRequestDetails(requestdetails: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails(requestdetails).toUInt()

public actual fun WSManPluginGetConfiguration(plugincontext: Long, flags: UInt, data: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration(plugincontext, flags.toInt(), data).toUInt()

public actual fun WSManPluginGetOperationParameters(requestdetails: Long, flags: UInt, data: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters(requestdetails, flags.toInt(), data).toUInt()

public actual fun WSManPluginOperationComplete(requestdetails: Long, flags: UInt, errorcode: UInt, extendedinformation: PCWSTR): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete(requestdetails, flags.toInt(), errorcode.toInt(), extendedinformation).toUInt()

public actual fun WSManPluginReceiveResult(requestdetails: Long, flags: UInt, stream: PCWSTR, streamresult: Long, commandstate: PCWSTR, exitcode: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult(requestdetails, flags.toInt(), stream, streamresult, commandstate, exitcode.toInt()).toUInt()

public actual fun WSManPluginReportCompletion(plugincontext: Long, flags: UInt): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion(plugincontext, flags.toInt()).toUInt()

public actual fun WSManPluginReportContext(requestdetails: Long, flags: UInt, context: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext(requestdetails, flags.toInt(), context).toUInt()

public actual fun WSManReceiveShellOutput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, desiredstreamset: Long, async: Long, receiveoperation: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput(shell, command, flags.toInt(), desiredstreamset, async, receiveoperation)
}

public actual fun WSManReconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManReconnectShell(shell, flags.toInt(), async)
}

public actual fun WSManReconnectShellCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand(commandhandle, flags.toInt(), async)
}

public actual fun WSManRunShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand(shell, flags.toInt(), commandline, args, options, async, command)
}

public actual fun WSManRunShellCommandEx(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx(shell, flags.toInt(), commandid, commandline, args, options, async, command)
}

public actual fun WSManSendShellInput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, streamid: PCWSTR, streamdata: Long, endofstream: BOOL, async: Long, sendoperation: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManSendShellInput(shell, command, flags.toInt(), streamid, streamdata, endofstream, async, sendoperation)
}

public actual fun WSManSetSessionOption(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, data: Long): UInt =
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption(session, option, data).toUInt()

public actual fun WSManSignalShell(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, code: PCWSTR, async: Long, signaloperation: Long) {
    WindowsWin32SystemRemotemanagementJniBridge.windowssys_windows_win32_system_remotemanagement_WSManSignalShell(shell, command, flags.toInt(), code, async, signaloperation)
}
