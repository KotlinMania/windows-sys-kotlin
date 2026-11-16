@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCloseSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCloseShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManConnectShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCreateSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCreateShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption
import io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssysWindowsWin32SystemRemotemanagementWSManSignalShell
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(commandhandle, flags, async.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle, flags)

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session, flags)

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(shellhandle, flags, async.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(session, flags, resourceuri.rawAddress.toCPointer<ByteVar>(), shellid.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), connectxml.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), shell.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, command: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(shell, flags, commandid.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), connectxml.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), command.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr, proxyinfo: ConstPtr, session: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(apihandle, connection.rawAddress.toCPointer<ByteVar>(), flags, serverauthenticationcredentials.rawAddress.toCPointer<ByteVar>(), proxyinfo.rawAddress.toCPointer<ByteVar>(), session.rawAddress.toCPointer<ByteVar>())

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(session, flags, resourceuri.rawAddress.toCPointer<ByteVar>(), startupinfo.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), createxml.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), shell.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(session, flags, resourceuri.rawAddress.toCPointer<ByteVar>(), shellid.rawAddress.toCPointer<ByteVar>(), startupinfo.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), createxml.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), shell.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle, flags)

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr, async: ConstPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(shell, flags, disconnectinfo.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(apihandle, flags, languagecode.rawAddress.toCPointer<ByteVar>(), errorcode, messagelength, message.rawAddress.toCPointer<ByteVar>(), messagelengthused.rawAddress.toCPointer<ByteVar>())

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(session, option, value.rawAddress.toCPointer<ByteVar>())

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(session, option, stringlength, string.rawAddress.toCPointer<ByteVar>(), stringlengthused.rawAddress.toCPointer<ByteVar>())

public actual fun wSManInitialize(flags: UInt, apihandle: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManInitialize(flags, apihandle.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(senderdetails.rawAddress.toCPointer<ByteVar>(), flags, userauthorizationcontext.rawAddress.toCPointer<ByteVar>(), errorcode, extendederrorinformation.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr, flags: UInt, quota: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(senderdetails.rawAddress.toCPointer<ByteVar>(), flags, quota.rawAddress.toCPointer<ByteVar>(), errorcode, extendederrorinformation.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(senderdetails.rawAddress.toCPointer<ByteVar>(), flags, userauthorizationcontext.rawAddress.toCPointer<ByteVar>(), impersonationtoken.rawAddress.toCPointer<ByteVar>(), userisadministrator, errorcode, extendederrorinformation.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(requestdetails.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginGetConfiguration(plugincontext: ConstPtr, flags: UInt, data: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(plugincontext.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginGetOperationParameters(requestdetails: ConstPtr, flags: UInt, data: MutPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(requestdetails.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginOperationComplete(requestdetails: ConstPtr, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(requestdetails.rawAddress.toCPointer<ByteVar>(), flags, errorcode, extendedinformation.rawAddress.toCPointer<ByteVar>())

public actual fun wSManPluginReceiveResult(requestdetails: ConstPtr, flags: UInt, stream: Pcwstr, streamresult: ConstPtr, commandstate: Pcwstr, exitcode: UInt): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(requestdetails.rawAddress.toCPointer<ByteVar>(), flags, stream.rawAddress.toCPointer<ByteVar>(), streamresult.rawAddress.toCPointer<ByteVar>(), commandstate.rawAddress.toCPointer<ByteVar>(), exitcode)

public actual fun wSManPluginReportCompletion(plugincontext: ConstPtr, flags: UInt): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(plugincontext.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wSManPluginReportContext(requestdetails: ConstPtr, flags: UInt, context: ConstPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(requestdetails.rawAddress.toCPointer<ByteVar>(), flags, context.rawAddress.toCPointer<ByteVar>())

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr, async: ConstPtr, receiveoperation: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(shell, command, flags, desiredstreamset.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), receiveoperation.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(shell, flags, async.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(commandhandle, flags, async.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(shell, flags, commandline.rawAddress.toCPointer<ByteVar>(), args.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), command.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(shell, flags, commandid.rawAddress.toCPointer<ByteVar>(), commandline.rawAddress.toCPointer<ByteVar>(), args.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), command.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr, endofstream: Bool, async: ConstPtr, sendoperation: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(shell, command, flags, streamid.rawAddress.toCPointer<ByteVar>(), streamdata.rawAddress.toCPointer<ByteVar>(), endofstream, async.rawAddress.toCPointer<ByteVar>(), sendoperation.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr): UInt =
    windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(session, option, data.rawAddress.toCPointer<ByteVar>())

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr, signaloperation: MutPtr) {
    windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(shell, command, flags, code.rawAddress.toCPointer<ByteVar>(), async.rawAddress.toCPointer<ByteVar>(), signaloperation.rawAddress.toCPointer<ByteVar>())
}
