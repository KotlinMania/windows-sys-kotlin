package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class WsmanAuthenticationCredentials(
    public var authenticationMechanism: UInt = 0u,
    public var anonymous: WsmanAuthenticationCredentials0 = WsmanAuthenticationCredentials0(),
)

public data class WsmanAuthenticationCredentials0(
    public var userAccount: WsmanUsernamePasswordCreds = WsmanUsernamePasswordCreds(),
    public var certificateThumbprint: Pcwstr = null,
)

public data class WsmanAuthzQuota(
    public var maxAllowedConcurrentShells: UInt = 0u,
    public var maxAllowedConcurrentOperations: UInt = 0u,
    public var timeslotSize: UInt = 0u,
    public var maxAllowedOperationsPerTimeslot: UInt = 0u,
)

public data class WsmanCertificateDetails(
    public var subject: Pcwstr = null,
    public var issuerName: Pcwstr = null,
    public var issuerThumbprint: Pcwstr = null,
    public var subjectName: Pcwstr = null,
)

public data class WsmanCommandArgSet(
    public var argsCount: UInt = 0u,
    public var args: Pcwstr = null,
)

public data class WsmanConnectData(
    public var data: WsmanData = WsmanData(),
)

public data class WsmanCreateShellData(
    public var data: WsmanData = WsmanData(),
)

public data class WsmanData(
    public var type: WSManDataType = 0,
    public var anonymous: WsmanData0 = WsmanData0(),
)

public data class WsmanData0(
    public var text: WsmanDataText = WsmanDataText(),
    public var binaryData: WsmanDataBinary = WsmanDataBinary(),
    public var number: UInt = 0u,
)

public data class WsmanDataBinary(
    public var dataLength: UInt = 0u,
    public var data: COpaquePointer? = null,
)

public data class WsmanDataText(
    public var bufferLength: UInt = 0u,
    public var buffer: Pcwstr = null,
)

public data class WsmanEnvironmentVariable(
    public var name: Pcwstr = null,
    public var value: Pcwstr = null,
)

public data class WsmanEnvironmentVariableSet(
    public var varsCount: UInt = 0u,
    public var vars: WsmanEnvironmentVariable? = null,
)

public data class WsmanError(
    public var code: UInt = 0u,
    public var errorDetail: Pcwstr = null,
    public var language: Pcwstr = null,
    public var machineName: Pcwstr = null,
    public var pluginName: Pcwstr = null,
)

public data class WsmanFilter(
    public var filter: Pcwstr = null,
    public var dialect: Pcwstr = null,
)

public data class WsmanFragment(
    public var path: Pcwstr = null,
    public var dialect: Pcwstr = null,
)

public data class WsmanKey(
    public var key: Pcwstr = null,
    public var value: Pcwstr = null,
)

public data class WsmanOperationInfo(
    public var fragment: WsmanFragment = WsmanFragment(),
    public var filter: WsmanFilter = WsmanFilter(),
    public var selectorSet: WsmanSelectorSet = WsmanSelectorSet(),
    public var optionSet: WsmanOptionSet = WsmanOptionSet(),
    public var reserved: COpaquePointer? = null,
    public var version: UInt = 0u,
)

public data class WsmanOperationInfoex(
    public var fragment: WsmanFragment = WsmanFragment(),
    public var filter: WsmanFilter = WsmanFilter(),
    public var selectorSet: WsmanSelectorSet = WsmanSelectorSet(),
    public var optionSet: WsmanOptionSetex = WsmanOptionSetex(),
    public var version: UInt = 0u,
    public var uiLocale: Pcwstr = null,
    public var dataLocale: Pcwstr = null,
)

public data class WsmanOption(
    public var name: Pcwstr = null,
    public var value: Pcwstr = null,
    public var mustComply: Bool = 0,
)

public data class WsmanOptionSet(
    public var optionsCount: UInt = 0u,
    public var options: WsmanOption? = null,
    public var optionsMustUnderstand: Bool = 0,
)

public data class WsmanOptionSetex(
    public var optionsCount: UInt = 0u,
    public var options: WsmanOption? = null,
    public var optionsMustUnderstand: Bool = 0,
    public var optionTypes: Pcwstr = null,
)

public data class WsmanPluginRequest(
    public var senderDetails: WsmanSenderDetails? = null,
    public var locale: Pcwstr = null,
    public var resourceUri: Pcwstr = null,
    public var operationInfo: WsmanOperationInfo? = null,
    public var shutdownNotification: Bool = 0,
    public var shutdownNotificationHandle: Handle = null,
    public var dataLocale: Pcwstr = null,
)

public data class WsmanProxyInfo(
    public var accessType: UInt = 0u,
    public var authenticationCredentials: WsmanAuthenticationCredentials = WsmanAuthenticationCredentials(),
)

public data class WsmanReceiveDataResult(
    public var streamId: Pcwstr = null,
    public var streamData: WsmanData = WsmanData(),
    public var commandState: Pcwstr = null,
    public var exitCode: UInt = 0u,
)

public data class WsmanResponseData(
    public var receiveData: WsmanReceiveDataResult = WsmanReceiveDataResult(),
    public var connectData: WsmanConnectData = WsmanConnectData(),
    public var createData: WsmanCreateShellData = WsmanCreateShellData(),
)

public data class WsmanSelectorSet(
    public var numberKeys: UInt = 0u,
    public var keys: WsmanKey? = null,
)

public data class WsmanSenderDetails(
    public var senderName: Pcwstr = null,
    public var authenticationMechanism: Pcwstr = null,
    public var certificateDetails: WsmanCertificateDetails? = null,
    public var clientToken: Handle = null,
    public var httpURL: Pcwstr = null,
)

public data class WsmanShellAsync(
    public var operationContext: COpaquePointer? = null,
    public var completionFunction: WsmanShellCompletionFunction = null,
)

public data class WsmanShellDisconnectInfo(
    public var idleTimeoutMs: UInt = 0u,
)

public data class WsmanShellStartupInfoV10(
    public var inputStreamSet: WsmanStreamIdSet? = null,
    public var outputStreamSet: WsmanStreamIdSet? = null,
    public var idleTimeoutMs: UInt = 0u,
    public var workingDirectory: Pcwstr = null,
    public var variableSet: WsmanEnvironmentVariableSet? = null,
)

public data class WsmanShellStartupInfoV11(
    public var base: WsmanShellStartupInfoV10 = WsmanShellStartupInfoV10(),
    public var name: Pcwstr = null,
)

public data class WsmanStreamIdSet(
    public var streamIDsCount: UInt = 0u,
    public var streamIDs: Pcwstr = null,
)

public data class WsmanUsernamePasswordCreds(
    public var username: Pcwstr = null,
    public var password: Pcwstr = null,
)
