@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCloseCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCloseOperation
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCloseSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCloseShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManConnectShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCreateSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCreateShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManDeinitialize
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManReconnectShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManSendShellInput
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_wSManSignalShell
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(commandhandle, flags, async?.value?.toCPointer<ByteVar>())
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(operationhandle, flags)

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManCloseSession(session.toLong(), flags)

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManCloseShell(shellhandle, flags, async?.value?.toCPointer<ByteVar>())
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManConnectShell(session.toLong(), flags, resourceuri?.value?.toCPointer<ByteVar>(), shellid?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), connectxml?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), shell?.value?.toCPointer<ByteVar>())
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(shell, flags, commandid?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), connectxml?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), command?.value?.toCPointer<ByteVar>())
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: COpaquePointer?, proxyinfo: COpaquePointer?, session: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManCreateSession(apihandle.toLong(), connection?.value?.toCPointer<ByteVar>(), flags, serverauthenticationcredentials?.value?.toCPointer<ByteVar>(), proxyinfo?.value?.toCPointer<ByteVar>(), session?.value?.toCPointer<ByteVar>())

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManCreateShell(session.toLong(), flags, resourceuri?.value?.toCPointer<ByteVar>(), startupinfo?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), createxml?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), shell?.value?.toCPointer<ByteVar>())
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(session.toLong(), flags, resourceuri?.value?.toCPointer<ByteVar>(), shellid?.value?.toCPointer<ByteVar>(), startupinfo?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), createxml?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), shell?.value?.toCPointer<ByteVar>())
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(apihandle.toLong(), flags)

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: COpaquePointer?, async: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(shell, flags, disconnectinfo?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>())
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(apihandle.toLong(), flags, languagecode?.value?.toCPointer<ByteVar>(), errorcode, messagelength, message?.value?.toCPointer<ByteVar>(), messagelengthused?.value?.toCPointer<ByteVar>())

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(session.toLong(), option, value?.value?.toCPointer<ByteVar>())

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(session.toLong(), option, stringlength, string?.value?.toCPointer<ByteVar>(), stringlengthused?.value?.toCPointer<ByteVar>())

public actual fun wSManInitialize(flags: UInt, apihandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManInitialize(flags, apihandle?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginAuthzOperationComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete(senderdetails?.value?.toCPointer<ByteVar>(), flags, userauthorizationcontext?.value?.toCPointer<ByteVar>(), errorcode, extendederrorinformation?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: COpaquePointer?, flags: UInt, quota: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete(senderdetails?.value?.toCPointer<ByteVar>(), flags, quota?.value?.toCPointer<ByteVar>(), errorcode, extendederrorinformation?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginAuthzUserComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete(senderdetails?.value?.toCPointer<ByteVar>(), flags, userauthorizationcontext?.value?.toCPointer<ByteVar>(), impersonationtoken?.value?.toCPointer<ByteVar>(), userisadministrator, errorcode, extendederrorinformation?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginFreeRequestDetails(requestdetails: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails(requestdetails?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginGetConfiguration(plugincontext: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration(plugincontext?.value?.toCPointer<ByteVar>(), flags, data?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginGetOperationParameters(requestdetails: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters(requestdetails?.value?.toCPointer<ByteVar>(), flags, data?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginOperationComplete(requestdetails: COpaquePointer?, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete(requestdetails?.value?.toCPointer<ByteVar>(), flags, errorcode, extendedinformation?.value?.toCPointer<ByteVar>())

public actual fun wSManPluginReceiveResult(requestdetails: COpaquePointer?, flags: UInt, stream: Pcwstr, streamresult: COpaquePointer?, commandstate: Pcwstr, exitcode: UInt): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult(requestdetails?.value?.toCPointer<ByteVar>(), flags, stream?.value?.toCPointer<ByteVar>(), streamresult?.value?.toCPointer<ByteVar>(), commandstate?.value?.toCPointer<ByteVar>(), exitcode)

public actual fun wSManPluginReportCompletion(plugincontext: COpaquePointer?, flags: UInt): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion(plugincontext?.value?.toCPointer<ByteVar>(), flags)

public actual fun wSManPluginReportContext(requestdetails: COpaquePointer?, flags: UInt, context: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext(requestdetails?.value?.toCPointer<ByteVar>(), flags, context?.value?.toCPointer<ByteVar>())

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: COpaquePointer?, async: COpaquePointer?, receiveoperation: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(shell, command, flags, desiredstreamset?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), receiveoperation?.value?.toCPointer<ByteVar>())
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(shell, flags, async?.value?.toCPointer<ByteVar>())
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(commandhandle, flags, async?.value?.toCPointer<ByteVar>())
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(shell, flags, commandline?.value?.toCPointer<ByteVar>(), args?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), command?.value?.toCPointer<ByteVar>())
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(shell, flags, commandid?.value?.toCPointer<ByteVar>(), commandline?.value?.toCPointer<ByteVar>(), args?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), command?.value?.toCPointer<ByteVar>())
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: COpaquePointer?, endofstream: Bool, async: COpaquePointer?, sendoperation: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(shell, command, flags, streamid?.value?.toCPointer<ByteVar>(), streamdata?.value?.toCPointer<ByteVar>(), endofstream, async?.value?.toCPointer<ByteVar>(), sendoperation?.value?.toCPointer<ByteVar>())
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: COpaquePointer?): UInt =
    windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(session.toLong(), option, data?.value?.toCPointer<ByteVar>())

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: COpaquePointer?, signaloperation: COpaquePointer?) {
    windowssys_windows_win32_system_remotemanagement_wSManSignalShell(shell, command, flags, code?.value?.toCPointer<ByteVar>(), async?.value?.toCPointer<ByteVar>(), signaloperation?.value?.toCPointer<ByteVar>())
}
