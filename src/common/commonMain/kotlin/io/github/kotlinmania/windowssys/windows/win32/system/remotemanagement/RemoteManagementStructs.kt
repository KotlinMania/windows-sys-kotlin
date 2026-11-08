package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class WSMAN_AUTHENTICATION_CREDENTIALS(public var authenticationMechanism: UInt = 0u, public var Anonymous: WSMAN_AUTHENTICATION_CREDENTIALS_0 = WSMAN_AUTHENTICATION_CREDENTIALS_0())

public data class WSMAN_AUTHENTICATION_CREDENTIALS_0(public var userAccount: WSMAN_USERNAME_PASSWORD_CREDS = WSMAN_USERNAME_PASSWORD_CREDS(), public var certificateThumbprint: PCWSTR = 0L)

public data class WSMAN_AUTHZ_QUOTA(
    public var maxAllowedConcurrentShells: UInt = 0u,
    public var maxAllowedConcurrentOperations: UInt = 0u,
    public var timeslotSize: UInt = 0u,
    public var maxAllowedOperationsPerTimeslot: UInt = 0u,
)

public data class WSMAN_CERTIFICATE_DETAILS(
    public var subject: PCWSTR = 0L,
    public var issuerName: PCWSTR = 0L,
    public var issuerThumbprint: PCWSTR = 0L,
    public var subjectName: PCWSTR = 0L,
)

public data class WSMAN_COMMAND_ARG_SET(public var argsCount: UInt = 0u, public var args: Long = 0L)

public data class WSMAN_CONNECT_DATA(public var data: WSMAN_DATA = WSMAN_DATA())

public data class WSMAN_CREATE_SHELL_DATA(public var data: WSMAN_DATA = WSMAN_DATA())

public data class WSMAN_DATA(public var type: WSManDataType = 0, public var Anonymous: WSMAN_DATA_0 = WSMAN_DATA_0())

public data class WSMAN_DATA_0(
    public var text: WSMAN_DATA_TEXT = WSMAN_DATA_TEXT(),
    public var binaryData: WSMAN_DATA_BINARY = WSMAN_DATA_BINARY(),
    public var number: UInt = 0u,
)

public data class WSMAN_DATA_BINARY(public var dataLength: UInt = 0u, public var data: Long = 0L)

public data class WSMAN_DATA_TEXT(public var bufferLength: UInt = 0u, public var buffer: PCWSTR = 0L)

public data class WSMAN_ENVIRONMENT_VARIABLE(public var name: PCWSTR = 0L, public var value: PCWSTR = 0L)

public data class WSMAN_ENVIRONMENT_VARIABLE_SET(public var varsCount: UInt = 0u, public var vars: Long = 0L)

public data class WSMAN_ERROR(
    public var code: UInt = 0u,
    public var errorDetail: PCWSTR = 0L,
    public var language: PCWSTR = 0L,
    public var machineName: PCWSTR = 0L,
    public var pluginName: PCWSTR = 0L,
)

public data class WSMAN_FILTER(public var filter: PCWSTR = 0L, public var dialect: PCWSTR = 0L)

public data class WSMAN_FRAGMENT(public var path: PCWSTR = 0L, public var dialect: PCWSTR = 0L)

public data class WSMAN_KEY(public var key: PCWSTR = 0L, public var value: PCWSTR = 0L)

public data class WSMAN_OPERATION_INFO(
    public var fragment: WSMAN_FRAGMENT = WSMAN_FRAGMENT(),
    public var filter: WSMAN_FILTER = WSMAN_FILTER(),
    public var selectorSet: WSMAN_SELECTOR_SET = WSMAN_SELECTOR_SET(),
    public var optionSet: WSMAN_OPTION_SET = WSMAN_OPTION_SET(),
    public var reserved: Long = 0L,
    public var version: UInt = 0u,
)

public data class WSMAN_OPERATION_INFOEX(
    public var fragment: WSMAN_FRAGMENT = WSMAN_FRAGMENT(),
    public var filter: WSMAN_FILTER = WSMAN_FILTER(),
    public var selectorSet: WSMAN_SELECTOR_SET = WSMAN_SELECTOR_SET(),
    public var optionSet: WSMAN_OPTION_SETEX = WSMAN_OPTION_SETEX(),
    public var version: UInt = 0u,
    public var uiLocale: PCWSTR = 0L,
    public var dataLocale: PCWSTR = 0L,
)

public data class WSMAN_OPTION(
    public var name: PCWSTR = 0L,
    public var value: PCWSTR = 0L,
    public var mustComply: BOOL = 0,
)

public data class WSMAN_OPTION_SET(
    public var optionsCount: UInt = 0u,
    public var options: Long = 0L,
    public var optionsMustUnderstand: BOOL = 0,
)

public data class WSMAN_OPTION_SETEX(
    public var optionsCount: UInt = 0u,
    public var options: Long = 0L,
    public var optionsMustUnderstand: BOOL = 0,
    public var optionTypes: Long = 0L,
)

public data class WSMAN_PLUGIN_REQUEST(
    public var senderDetails: Long = 0L,
    public var locale: PCWSTR = 0L,
    public var resourceUri: PCWSTR = 0L,
    public var operationInfo: Long = 0L,
    public var shutdownNotification: BOOL = 0,
    public var shutdownNotificationHandle: HANDLE = 0L,
    public var dataLocale: PCWSTR = 0L,
)

public data class WSMAN_PROXY_INFO(public var accessType: UInt = 0u, public var authenticationCredentials: WSMAN_AUTHENTICATION_CREDENTIALS = WSMAN_AUTHENTICATION_CREDENTIALS())

public data class WSMAN_RECEIVE_DATA_RESULT(
    public var streamId: PCWSTR = 0L,
    public var streamData: WSMAN_DATA = WSMAN_DATA(),
    public var commandState: PCWSTR = 0L,
    public var exitCode: UInt = 0u,
)

public data class WSMAN_RESPONSE_DATA(
    public var receiveData: WSMAN_RECEIVE_DATA_RESULT = WSMAN_RECEIVE_DATA_RESULT(),
    public var connectData: WSMAN_CONNECT_DATA = WSMAN_CONNECT_DATA(),
    public var createData: WSMAN_CREATE_SHELL_DATA = WSMAN_CREATE_SHELL_DATA(),
)

public data class WSMAN_SELECTOR_SET(public var numberKeys: UInt = 0u, public var keys: Long = 0L)

public data class WSMAN_SENDER_DETAILS(
    public var senderName: PCWSTR = 0L,
    public var authenticationMechanism: PCWSTR = 0L,
    public var certificateDetails: Long = 0L,
    public var clientToken: HANDLE = 0L,
    public var httpURL: PCWSTR = 0L,
)

public data class WSMAN_SHELL_ASYNC(public var operationContext: Long = 0L, public var completionFunction: WSMAN_SHELL_COMPLETION_FUNCTION = null)

public data class WSMAN_SHELL_DISCONNECT_INFO(public var idleTimeoutMs: UInt = 0u)

public data class WSMAN_SHELL_STARTUP_INFO_V10(
    public var inputStreamSet: Long = 0L,
    public var outputStreamSet: Long = 0L,
    public var idleTimeoutMs: UInt = 0u,
    public var workingDirectory: PCWSTR = 0L,
    public var variableSet: Long = 0L,
)

public data class WSMAN_SHELL_STARTUP_INFO_V11(public var Base: WSMAN_SHELL_STARTUP_INFO_V10 = WSMAN_SHELL_STARTUP_INFO_V10(), public var name: PCWSTR = 0L)

public data class WSMAN_STREAM_ID_SET(public var streamIDsCount: UInt = 0u, public var streamIDs: Long = 0L)

public data class WSMAN_USERNAME_PASSWORD_CREDS(public var username: PCWSTR = 0L, public var password: PCWSTR = 0L)
