@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAccept
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAddProvider
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAddProviderA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAddProviderW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAddToConference
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAgentSpecific
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineAnswer
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineBlindTransfer
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineBlindTransferA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineBlindTransferW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineClose
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineCompleteCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineCompleteTransfer
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigDialog
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigDialogA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigDialogEdit
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigDialogEditA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigDialogEditW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigDialogW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineConfigProvider
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineCreateAgentA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineCreateAgentW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDeallocateCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDevSpecific
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDevSpecificFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDial
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDialA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDialW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineDrop
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineForward
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineForwardA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineForwardW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGatherDigits
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGatherDigitsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGatherDigitsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGenerateDigits
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGenerateDigitsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGenerateDigitsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGenerateTone
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressCapsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressCapsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressID
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressIDA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressIDW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressStatusA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAddressStatusW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentCapsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentCapsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentSessionList
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentStatusA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAgentStatusW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAppPriority
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAppPriorityA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetAppPriorityW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCallInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCallInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCallInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCallStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCountry
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCountryA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetCountryW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetDevCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetDevConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetDevConfigA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetDevConfigW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetGroupListA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetGroupListW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetID
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetIDA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetIDW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetIcon
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetIconA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetIconW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetLineDevStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetMessage
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetNewCalls
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetNumRings
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetProviderList
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetProviderListA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetProviderListW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetProxyStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetQueueInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetQueueListA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetQueueListW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetRequest
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetRequestA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetRequestW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetStatusMessages
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetTranslateCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineHandoff
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineHandoffA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineHandoffW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineHold
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineInitialize
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineInitializeExA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineInitializeExW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineMakeCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineMakeCallA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineMakeCallW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineMonitorDigits
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineMonitorMedia
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineMonitorTones
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineOpen
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineOpenA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineOpenW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePark
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineParkA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineParkW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePickup
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePickupA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePickupW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePrepareAddToConference
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineProxyMessage
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineProxyResponse
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineRedirect
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineRedirectA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineRedirectW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineRemoveFromConference
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineRemoveProvider
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSecureCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSendUserUserInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAgentActivity
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAgentGroup
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAgentSessionState
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAgentState
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAgentStateEx
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAppPriority
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAppPriorityA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAppPriorityW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetAppSpecific
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetCallData
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetCallParams
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetCallPrivilege
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetCallTreatment
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetCurrentLocation
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetDevConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetDevConfigA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetDevConfigW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetLineDevStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetMediaControl
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetMediaMode
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetNumRings
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetStatusMessages
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetTerminal
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetTollList
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetTollListA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetTollListW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetupConference
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetupConferenceA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetupConferenceW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetupTransfer
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetupTransferA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSetupTransferW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineShutdown
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineSwapHold
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineTranslateAddress
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineTranslateAddressA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineTranslateAddressW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineTranslateDialog
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineTranslateDialogA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineTranslateDialogW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineUncompleteCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineUnhold
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineUnpark
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineUnparkA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiLineUnparkW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiOpenTnefStream
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiOpenTnefStreamEx
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneClose
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneConfigDialog
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneConfigDialogA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneConfigDialogW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneDevSpecific
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetData
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetDevCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetDisplay
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetGain
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetID
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetIDA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetIDW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetIcon
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetIconA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetIconW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetLamp
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetMessage
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetRing
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetStatusA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetStatusW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneGetVolume
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneInitialize
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneInitializeExA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneInitializeExW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneOpen
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetData
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetDisplay
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetGain
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetLamp
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetRing
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneSetVolume
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiPhoneShutdown
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiGetLocationInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestDrop
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestMakeCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestMediaCall
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA
import io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getTnefStreamCodepage(lpstream: MutPtr<CVoid>, lpulcodepage: MutPtr<UInt>, lpulsubcodepage: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(lpstream.rawAddress.toCPointer<ByteVar>(), lpulcodepage.rawAddress.toCPointer<ByteVar>(), lpulsubcodepage.rawAddress.toCPointer<ByteVar>())

public actual fun openTnefStream(lpvsupport: MutPtr<CVoid>, lpstream: MutPtr<CVoid>, lpszstreamname: ConstPtr<Byte>, ulflags: UInt, lpmessage: MutPtr<CVoid>, wkeyval: UShort, lpptnef: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32DevicesTapiOpenTnefStream(lpvsupport.rawAddress.toCPointer<ByteVar>(), lpstream.rawAddress.toCPointer<ByteVar>(), lpszstreamname.rawAddress.toCPointer<ByteVar>(), ulflags, lpmessage.rawAddress.toCPointer<ByteVar>(), wkeyval, lpptnef.rawAddress.toCPointer<ByteVar>())

public actual fun openTnefStreamEx(lpvsupport: MutPtr<CVoid>, lpstream: MutPtr<CVoid>, lpszstreamname: ConstPtr<Byte>, ulflags: UInt, lpmessage: MutPtr<CVoid>, wkeyval: UShort, lpadressbook: MutPtr<CVoid>, lpptnef: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32DevicesTapiOpenTnefStreamEx(lpvsupport.rawAddress.toCPointer<ByteVar>(), lpstream.rawAddress.toCPointer<ByteVar>(), lpszstreamname.rawAddress.toCPointer<ByteVar>(), ulflags, lpmessage.rawAddress.toCPointer<ByteVar>(), wkeyval, lpadressbook.rawAddress.toCPointer<ByteVar>(), lpptnef.rawAddress.toCPointer<ByteVar>())

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineAccept(hcall, lpsuseruserinfo.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineAddProvider(lpszproviderfilename.rawAddress.toCPointer<ByteVar>(), hwndowner.rawAddress.toCPointer<ByteVar>(), lpdwpermanentproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineAddProviderA(lpszproviderfilename.rawAddress.toCPointer<ByteVar>(), hwndowner.rawAddress.toCPointer<ByteVar>(), lpdwpermanentproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineAddProviderW(lpszproviderfilename.rawAddress.toCPointer<ByteVar>(), hwndowner.rawAddress.toCPointer<ByteVar>(), lpdwpermanentproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall, hconsultcall)

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineAgentSpecific(hline, dwaddressid, dwagentextensionidindex, lpparams.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineAnswer(hcall, lpsuseruserinfo.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineBlindTransfer(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineBlindTransferA(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineBlindTransferW(hcall, lpszdestaddressw.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineClose(hline: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineClose(hline)

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: MutPtr<UInt>, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineCompleteCall(hcall, lpdwcompletionid.rawAddress.toCPointer<ByteVar>(), dwcompletionmode, dwmessageid)

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: MutPtr<UInt>, dwtransfermode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineCompleteTransfer(hcall, hconsultcall, lphconfcall.rawAddress.toCPointer<ByteVar>(), dwtransfermode)

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineConfigDialog(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineConfigDialogA(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiLineConfigDialogEdit(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lpdeviceconfigin.rawAddress.toCPointer<ByteVar>(), dwsize, lpdeviceconfigout.rawAddress.toCPointer<ByteVar>())

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiLineConfigDialogEditA(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lpdeviceconfigin.rawAddress.toCPointer<ByteVar>(), dwsize, lpdeviceconfigout.rawAddress.toCPointer<ByteVar>())

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiLineConfigDialogEditW(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lpdeviceconfigin.rawAddress.toCPointer<ByteVar>(), dwsize, lpdeviceconfigout.rawAddress.toCPointer<ByteVar>())

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLineConfigDialogW(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineConfigProvider(hwndowner.rawAddress.toCPointer<ByteVar>(), dwpermanentproviderid)

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineCreateAgentA(hline, lpszagentid.rawAddress.toCPointer<ByteVar>(), lpszagentpin.rawAddress.toCPointer<ByteVar>(), lphagent.rawAddress.toCPointer<ByteVar>())

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: MutPtr<Guid>, lphagentsession: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(hline, hagent, lpszagentpin.rawAddress.toCPointer<ByteVar>(), dwworkingaddressid, lpgroupid.rawAddress.toCPointer<ByteVar>(), lphagentsession.rawAddress.toCPointer<ByteVar>())

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: MutPtr<Guid>, lphagentsession: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(hline, hagent, lpszagentpin.rawAddress.toCPointer<ByteVar>(), dwworkingaddressid, lpgroupid.rawAddress.toCPointer<ByteVar>(), lphagentsession.rawAddress.toCPointer<ByteVar>())

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineCreateAgentW(hline, lpszagentid.rawAddress.toCPointer<ByteVar>(), lpszagentpin.rawAddress.toCPointer<ByteVar>(), lphagent.rawAddress.toCPointer<ByteVar>())

public actual fun lineDeallocateCall(hcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall)

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDevSpecific(hline, dwaddressid, hcall, lpparams.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDevSpecificFeature(hline, dwfeature, lpparams.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDial(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDialA(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDialW(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineDrop(hcall, lpsuseruserinfo.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineForward(hline, balladdresses, dwaddressid, lpforwardlist.rawAddress.toCPointer<ByteVar>(), dwnumringsnoanswer, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineForwardA(hline, balladdresses, dwaddressid, lpforwardlist.rawAddress.toCPointer<ByteVar>(), dwnumringsnoanswer, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineForwardW(hline, balladdresses, dwaddressid, lpforwardlist.rawAddress.toCPointer<ByteVar>(), dwnumringsnoanswer, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGatherDigits(hcall, dwdigitmodes, lpsdigits.rawAddress.toCPointer<ByteVar>(), dwnumdigits, lpszterminationdigits.rawAddress.toCPointer<ByteVar>(), dwfirstdigittimeout, dwinterdigittimeout)

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGatherDigitsA(hcall, dwdigitmodes, lpsdigits.rawAddress.toCPointer<ByteVar>(), dwnumdigits, lpszterminationdigits.rawAddress.toCPointer<ByteVar>(), dwfirstdigittimeout, dwinterdigittimeout)

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGatherDigitsW(hcall, dwdigitmodes, lpsdigits.rawAddress.toCPointer<ByteVar>(), dwnumdigits, lpszterminationdigits.rawAddress.toCPointer<ByteVar>(), dwfirstdigittimeout, dwinterdigittimeout)

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGenerateDigits(hcall, dwdigitmode, lpszdigits.rawAddress.toCPointer<ByteVar>(), dwduration)

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGenerateDigitsA(hcall, dwdigitmode, lpszdigits.rawAddress.toCPointer<ByteVar>(), dwduration)

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGenerateDigitsW(hcall, dwdigitmode, lpszdigits.rawAddress.toCPointer<ByteVar>(), dwduration)

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: ConstPtr<Linegeneratetone>): Int =
    windowssysWindowsWin32DevicesTapiLineGenerateTone(hcall, dwtonemode, dwduration, dwnumtones, lptones.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressCaps(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressCapsA(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressCapsW(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressID(hline, lpdwaddressid.rawAddress.toCPointer<ByteVar>(), dwaddressmode, lpsaddress.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressIDA(hline, lpdwaddressid.rawAddress.toCPointer<ByteVar>(), dwaddressmode, lpsaddress.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressIDW(hline, lpdwaddressid.rawAddress.toCPointer<ByteVar>(), dwaddressmode, lpsaddress.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressStatus(hline, dwaddressid, lpaddressstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressStatusA(hline, dwaddressid, lpaddressstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAddressStatusW(hline, dwaddressid, lpaddressstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr<Lineagentactivitylist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(hline, dwaddressid, lpagentactivitylist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr<Lineagentactivitylist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(hline, dwaddressid, lpagentactivitylist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr<Lineagentcaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentCapsA(hlineapp, dwdeviceid, dwaddressid, dwappapiversion, lpagentcaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr<Lineagentcaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentCapsW(hlineapp, dwdeviceid, dwaddressid, dwappapiversion, lpagentcaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(hline, dwaddressid, lpagentgrouplist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(hline, dwaddressid, lpagentgrouplist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: MutPtr<Lineagentinfo>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentInfo(hline, hagent, lpagentinfo.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: MutPtr<Lineagentsessioninfo>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(hline, hagentsession, lpagentsessioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: MutPtr<Lineagentsessionlist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentSessionList(hline, hagent, lpagentsessionlist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr<Lineagentstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentStatusA(hline, dwaddressid, lpagentstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr<Lineagentstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAgentStatusW(hline, dwaddressid, lpagentstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAppPriority(lpszappfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode, lpextensionid.rawAddress.toCPointer<ByteVar>(), dwrequestmode, lpextensionname.rawAddress.toCPointer<ByteVar>(), lpdwpriority.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAppPriorityA(lpszappfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode, lpextensionid.rawAddress.toCPointer<ByteVar>(), dwrequestmode, lpextensionname.rawAddress.toCPointer<ByteVar>(), lpdwpriority.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineGetAppPriorityW(lpszappfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode, lpextensionid.rawAddress.toCPointer<ByteVar>(), dwrequestmode, lpextensionname.rawAddress.toCPointer<ByteVar>(), lpdwpriority.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCallInfo(hcall, lpcallinfo.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCallInfoA(hcall, lpcallinfo.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCallInfoW(hcall, lpcallinfo.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: MutPtr<Linecallstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCallStatus(hcall, lpcallstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: MutPtr<Linecalllist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(hcall, lpcalllist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCountry(dwcountryid, dwapiversion, lplinecountrylist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCountryA(dwcountryid, dwapiversion, lplinecountrylist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetCountryW(dwcountryid, dwapiversion, lplinecountrylist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetDevCaps(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetDevCapsA(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetDevCapsW(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineGetDevConfig(dwdeviceid, lpdeviceconfig.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineGetDevConfigA(dwdeviceid, lpdeviceconfig.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLineGetDevConfigW(dwdeviceid, lpdeviceconfig.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: MutPtr<Lineagentgrouplist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetGroupListA(hline, lpgrouplist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: MutPtr<Lineagentgrouplist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetGroupListW(hline, lpgrouplist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineGetID(hline, dwaddressid, hcall, dwselect, lpdeviceid.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineGetIDA(hline, dwaddressid, hcall, dwselect, lpdeviceid.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLineGetIDW(hline, dwaddressid, hcall, dwselect, lpdeviceid.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    windowssysWindowsWin32DevicesTapiLineGetIcon(dwdeviceid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lphicon.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    windowssysWindowsWin32DevicesTapiLineGetIconA(dwdeviceid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lphicon.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr<Hicon>): Int =
    windowssysWindowsWin32DevicesTapiLineGetIconW(dwdeviceid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lphicon.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetLineDevStatus(hline, lplinedevstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(hline, lplinedevstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int =
    windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(hline, lplinedevstatus.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: MutPtr<Linemessage>, dwtimeout: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineGetMessage(hlineapp, lpmessage.rawAddress.toCPointer<ByteVar>(), dwtimeout)

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: MutPtr<Linecalllist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetNewCalls(hline, dwaddressid, dwselect, lpcalllist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineGetNumRings(hline, dwaddressid, lpdwnumrings.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetProviderList(dwapiversion, lpproviderlist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetProviderListA(dwapiversion, lpproviderlist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetProviderListW(dwapiversion, lpproviderlist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: MutPtr<Lineproxyrequestlist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetProxyStatus(hlineapp, dwdeviceid, dwappapiversion, lplineproxyreqestlist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: MutPtr<Linequeueinfo>): Int =
    windowssysWindowsWin32DevicesTapiLineGetQueueInfo(hline, dwqueueid, lplinequeueinfo.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: MutPtr<Guid>, lpqueuelist: MutPtr<Linequeuelist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetQueueListA(hline, lpgroupid.rawAddress.toCPointer<ByteVar>(), lpqueuelist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: MutPtr<Guid>, lpqueuelist: MutPtr<Linequeuelist>): Int =
    windowssysWindowsWin32DevicesTapiLineGetQueueListW(hline, lpgroupid.rawAddress.toCPointer<ByteVar>(), lpqueuelist.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int =
    windowssysWindowsWin32DevicesTapiLineGetRequest(hlineapp, dwrequestmode, lprequestbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int =
    windowssysWindowsWin32DevicesTapiLineGetRequestA(hlineapp, dwrequestmode, lprequestbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int =
    windowssysWindowsWin32DevicesTapiLineGetRequestW(hlineapp, dwrequestmode, lprequestbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: MutPtr<UInt>, lpdwaddressstates: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineGetStatusMessages(hline, lpdwlinestates.rawAddress.toCPointer<ByteVar>(), lpdwaddressstates.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetTranslateCaps(hlineapp, dwapiversion, lptranslatecaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(hlineapp, dwapiversion, lptranslatecaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int =
    windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(hlineapp, dwapiversion, lptranslatecaps.rawAddress.toCPointer<ByteVar>())

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineHandoff(hcall, lpszfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode)

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineHandoffA(hcall, lpszfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode)

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineHandoffW(hcall, lpszfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode)

public actual fun lineHold(hcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineHold(hcall)

public actual fun lineInitialize(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineInitialize(lphlineapp.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpdwnumdevs.rawAddress.toCPointer<ByteVar>())

public actual fun lineInitializeExA(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lplineinitializeexparams: MutPtr<Lineinitializeexparams>): Int =
    windowssysWindowsWin32DevicesTapiLineInitializeExA(lphlineapp.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszfriendlyappname.rawAddress.toCPointer<ByteVar>(), lpdwnumdevs.rawAddress.toCPointer<ByteVar>(), lpdwapiversion.rawAddress.toCPointer<ByteVar>(), lplineinitializeexparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineInitializeExW(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lplineinitializeexparams: MutPtr<Lineinitializeexparams>): Int =
    windowssysWindowsWin32DevicesTapiLineInitializeExW(lphlineapp.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszfriendlyappname.rawAddress.toCPointer<ByteVar>(), lpdwnumdevs.rawAddress.toCPointer<ByteVar>(), lpdwapiversion.rawAddress.toCPointer<ByteVar>(), lplineinitializeexparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineMakeCall(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineMakeCall(hline, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineMakeCallA(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineMakeCallA(hline, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineMakeCallW(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineMakeCallW(hline, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall, dwdigitmodes)

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall, dwmediamodes)

public actual fun lineMonitorTones(hcall: UInt, lptonelist: ConstPtr<Linemonitortone>, dwnumentries: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineMonitorTones(hcall, lptonelist.rawAddress.toCPointer<ByteVar>(), dwnumentries)

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr<UInt>, lpextensionid: MutPtr<Lineextensionid>): Int =
    windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(hlineapp, dwdeviceid, dwapilowversion, dwapihighversion, lpdwapiversion.rawAddress.toCPointer<ByteVar>(), lpextensionid.rawAddress.toCPointer<ByteVar>())

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(hlineapp, dwdeviceid, dwapiversion, dwextlowversion, dwexthighversion, lpdwextversion.rawAddress.toCPointer<ByteVar>())

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineOpen(hlineapp, dwdeviceid, lphline.rawAddress.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineOpenA(hlineapp, dwdeviceid, lphline.rawAddress.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineOpenW(hlineapp, dwdeviceid, lphline.rawAddress.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiLinePark(hcall, dwparkmode, lpszdiraddress.rawAddress.toCPointer<ByteVar>(), lpnondiraddress.rawAddress.toCPointer<ByteVar>())

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiLineParkA(hcall, dwparkmode, lpszdiraddress.rawAddress.toCPointer<ByteVar>(), lpnondiraddress.rawAddress.toCPointer<ByteVar>())

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiLineParkW(hcall, dwparkmode, lpszdiraddress.rawAddress.toCPointer<ByteVar>(), lpnondiraddress.rawAddress.toCPointer<ByteVar>())

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLinePickup(hline, dwaddressid, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszgroupid.rawAddress.toCPointer<ByteVar>())

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLinePickupA(hline, dwaddressid, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszgroupid.rawAddress.toCPointer<ByteVar>())

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLinePickupW(hline, dwaddressid, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszgroupid.rawAddress.toCPointer<ByteVar>())

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLinePrepareAddToConference(hconfcall, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(hconfcall, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(hconfcall, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineProxyMessage(hline, hcall, dwmsg, dwparam1, dwparam2, dwparam3)

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: MutPtr<Lineproxyrequest>, dwresult: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineProxyResponse(hline, lpproxyrequest.rawAddress.toCPointer<ByteVar>(), dwresult)

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineRedirect(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineRedirectA(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineRedirectW(hcall, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp, dwregistrationinstance, dwrequestmode, benable)

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall)

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall)

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    windowssysWindowsWin32DevicesTapiLineRemoveProvider(dwpermanentproviderid, hwndowner.rawAddress.toCPointer<ByteVar>())

public actual fun lineSecureCall(hcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSecureCall(hcall)

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSendUserUserInfo(hcall, lpsuseruserinfo.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline, dwaddressid, dwactivityid)

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int =
    windowssysWindowsWin32DevicesTapiLineSetAgentGroup(hline, dwaddressid, lpagentgrouplist.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline, hagent, dwmeasurementperiod)

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline, hagentsession, dwagentsessionstate, dwnextagentsessionstate)

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAgentState(hline, dwaddressid, dwagentstate, dwnextagentstate)

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline, hagent, dwagentstate, dwnextagentstate)

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAppPriority(lpszappfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode, lpextensionid.rawAddress.toCPointer<ByteVar>(), dwrequestmode, lpszextensionname.rawAddress.toCPointer<ByteVar>(), dwpriority)

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAppPriorityA(lpszappfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode, lpextensionid.rawAddress.toCPointer<ByteVar>(), dwrequestmode, lpszextensionname.rawAddress.toCPointer<ByteVar>(), dwpriority)

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAppPriorityW(lpszappfilename.rawAddress.toCPointer<ByteVar>(), dwmediamode, lpextensionid.rawAddress.toCPointer<ByteVar>(), dwrequestmode, lpszextensionname.rawAddress.toCPointer<ByteVar>(), dwpriority)

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall, dwappspecific)

public actual fun lineSetCallData(hcall: UInt, lpcalldata: MutPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetCallData(hcall, lpcalldata.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: ConstPtr<Linedialparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetCallParams(hcall, dwbearermode, dwminrate, dwmaxrate, lpdialparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall, dwcallprivilege)

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: MutPtr<CVoid>, dwsendingflowspecsize: UInt, lpreceivingflowspec: MutPtr<CVoid>, dwreceivingflowspecsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(hcall, lpsendingflowspec.rawAddress.toCPointer<ByteVar>(), dwsendingflowspecsize, lpreceivingflowspec.rawAddress.toCPointer<ByteVar>(), dwreceivingflowspecsize)

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall, dwtreatment)

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp, dwlocation)

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineSetDevConfig(dwdeviceid, lpdeviceconfig.rawAddress.toCPointer<ByteVar>(), dwsize, lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineSetDevConfigA(dwdeviceid, lpdeviceconfig.rawAddress.toCPointer<ByteVar>(), dwsize, lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLineSetDevConfigW(dwdeviceid, lpdeviceconfig.rawAddress.toCPointer<ByteVar>(), dwsize, lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline, dwstatustochange, fstatus)

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: ConstPtr<Linemediacontroldigit>, dwdigitnumentries: UInt, lpmedialist: ConstPtr<Linemediacontrolmedia>, dwmedianumentries: UInt, lptonelist: ConstPtr<Linemediacontroltone>, dwtonenumentries: UInt, lpcallstatelist: ConstPtr<Linemediacontrolcallstate>, dwcallstatenumentries: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetMediaControl(hline, dwaddressid, hcall, dwselect, lpdigitlist.rawAddress.toCPointer<ByteVar>(), dwdigitnumentries, lpmedialist.rawAddress.toCPointer<ByteVar>(), dwmedianumentries, lptonelist.rawAddress.toCPointer<ByteVar>(), dwtonenumentries, lpcallstatelist.rawAddress.toCPointer<ByteVar>(), dwcallstatenumentries)

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall, dwmediamodes)

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetNumRings(hline, dwaddressid, dwnumrings)

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline, dwqueueid, dwmeasurementperiod)

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline, dwlinestates, dwaddressstates)

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetTerminal(hline, dwaddressid, hcall, dwselect, dwterminalmodes, dwterminalid, benable)

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetTollList(hlineapp, dwdeviceid, lpszaddressin.rawAddress.toCPointer<ByteVar>(), dwtolllistoption)

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetTollListA(hlineapp, dwdeviceid, lpszaddressin.rawAddress.toCPointer<ByteVar>(), dwtolllistoption)

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSetTollListW(hlineapp, dwdeviceid, lpszaddressinw.rawAddress.toCPointer<ByteVar>(), dwtolllistoption)

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetupConference(hcall, hline, lphconfcall.rawAddress.toCPointer<ByteVar>(), lphconsultcall.rawAddress.toCPointer<ByteVar>(), dwnumparties, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetupConferenceA(hcall, hline, lphconfcall.rawAddress.toCPointer<ByteVar>(), lphconsultcall.rawAddress.toCPointer<ByteVar>(), dwnumparties, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetupConferenceW(hcall, hline, lphconfcall.rawAddress.toCPointer<ByteVar>(), lphconsultcall.rawAddress.toCPointer<ByteVar>(), dwnumparties, lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetupTransfer(hcall, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetupTransferA(hcall, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    windowssysWindowsWin32DevicesTapiLineSetupTransferW(hcall, lphconsultcall.rawAddress.toCPointer<ByteVar>(), lpcallparams.rawAddress.toCPointer<ByteVar>())

public actual fun lineShutdown(hlineapp: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineShutdown(hlineapp)

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall, hheldcall)

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int =
    windowssysWindowsWin32DevicesTapiLineTranslateAddress(hlineapp, dwdeviceid, dwapiversion, lpszaddressin.rawAddress.toCPointer<ByteVar>(), dwcard, dwtranslateoptions, lptranslateoutput.rawAddress.toCPointer<ByteVar>())

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int =
    windowssysWindowsWin32DevicesTapiLineTranslateAddressA(hlineapp, dwdeviceid, dwapiversion, lpszaddressin.rawAddress.toCPointer<ByteVar>(), dwcard, dwtranslateoptions, lptranslateoutput.rawAddress.toCPointer<ByteVar>())

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int =
    windowssysWindowsWin32DevicesTapiLineTranslateAddressW(hlineapp, dwdeviceid, dwapiversion, lpszaddressin.rawAddress.toCPointer<ByteVar>(), dwcard, dwtranslateoptions, lptranslateoutput.rawAddress.toCPointer<ByteVar>())

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineTranslateDialog(hlineapp, dwdeviceid, dwapiversion, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszaddressin.rawAddress.toCPointer<ByteVar>())

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineTranslateDialogA(hlineapp, dwdeviceid, dwapiversion, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszaddressin.rawAddress.toCPointer<ByteVar>())

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLineTranslateDialogW(hlineapp, dwdeviceid, dwapiversion, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszaddressin.rawAddress.toCPointer<ByteVar>())

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineUncompleteCall(hline, dwcompletionid)

public actual fun lineUnhold(hcall: UInt): Int =
    windowssysWindowsWin32DevicesTapiLineUnhold(hcall)

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineUnpark(hline, dwaddressid, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>())

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiLineUnparkA(hline, dwaddressid, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>())

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiLineUnparkW(hline, dwaddressid, lphcall.rawAddress.toCPointer<ByteVar>(), lpszdestaddress.rawAddress.toCPointer<ByteVar>())

public actual fun phoneClose(hphone: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneClose(hphone)

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiPhoneConfigDialog(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiPhoneConfigDialogA(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiPhoneConfigDialogW(dwdeviceid, hwndowner.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun phoneDevSpecific(hphone: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneDevSpecific(hphone, lpparams.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(hphone, dwbuttonlampid, lpbuttoninfo.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(hphone, dwbuttonlampid, lpbuttoninfo.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(hphone, dwbuttonlampid, lpbuttoninfo.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: MutPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetData(hphone, dwdataid, lpdata.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetDevCaps(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: MutPtr<Varstring>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetDisplay(hphone, lpdisplay.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetGain(hphone, dwhookswitchdev, lpdwgain.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(hphone, lpdwhookswitchdevs.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetID(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetID(hphone, lpdeviceid.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetIDA(hphone, lpdeviceid.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetIDW(hphone, lpdeviceid.rawAddress.toCPointer<ByteVar>(), lpszdeviceclass.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetIcon(dwdeviceid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lphicon.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetIconA(dwdeviceid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lphicon.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr<Hicon>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetIconW(dwdeviceid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lphicon.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetLamp(hphone, dwbuttonlampid, lpdwlampmode.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: MutPtr<Phonemessage>, dwtimeout: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetMessage(hphoneapp, lpmessage.rawAddress.toCPointer<ByteVar>(), dwtimeout)

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: MutPtr<UInt>, lpdwvolume: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetRing(hphone, lpdwringmode.rawAddress.toCPointer<ByteVar>(), lpdwvolume.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetStatus(hphone, lpphonestatus.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetStatusA(hphone, lpphonestatus.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: MutPtr<UInt>, lpdwbuttonmodes: MutPtr<UInt>, lpdwbuttonstates: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(hphone, lpdwphonestates.rawAddress.toCPointer<ByteVar>(), lpdwbuttonmodes.rawAddress.toCPointer<ByteVar>(), lpdwbuttonstates.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetStatusW(hphone, lpphonestatus.rawAddress.toCPointer<ByteVar>())

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneGetVolume(hphone, dwhookswitchdev, lpdwvolume.rawAddress.toCPointer<ByteVar>())

public actual fun phoneInitialize(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneInitialize(lphphoneapp.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpdwnumdevs.rawAddress.toCPointer<ByteVar>())

public actual fun phoneInitializeExA(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lpphoneinitializeexparams: MutPtr<Phoneinitializeexparams>): Int =
    windowssysWindowsWin32DevicesTapiPhoneInitializeExA(lphphoneapp.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszfriendlyappname.rawAddress.toCPointer<ByteVar>(), lpdwnumdevs.rawAddress.toCPointer<ByteVar>(), lpdwapiversion.rawAddress.toCPointer<ByteVar>(), lpphoneinitializeexparams.rawAddress.toCPointer<ByteVar>())

public actual fun phoneInitializeExW(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lpphoneinitializeexparams: MutPtr<Phoneinitializeexparams>): Int =
    windowssysWindowsWin32DevicesTapiPhoneInitializeExW(lphphoneapp.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszfriendlyappname.rawAddress.toCPointer<ByteVar>(), lpdwnumdevs.rawAddress.toCPointer<ByteVar>(), lpdwapiversion.rawAddress.toCPointer<ByteVar>(), lpphoneinitializeexparams.rawAddress.toCPointer<ByteVar>())

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr<UInt>, lpextensionid: MutPtr<Phoneextensionid>): Int =
    windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(hphoneapp, dwdeviceid, dwapilowversion, dwapihighversion, lpdwapiversion.rawAddress.toCPointer<ByteVar>(), lpextensionid.rawAddress.toCPointer<ByteVar>())

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(hphoneapp, dwdeviceid, dwapiversion, dwextlowversion, dwexthighversion, lpdwextversion.rawAddress.toCPointer<ByteVar>())

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneOpen(hphoneapp, dwdeviceid, lphphone.rawAddress.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivilege)

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(hphone, dwbuttonlampid, lpbuttoninfo.rawAddress.toCPointer<ByteVar>())

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(hphone, dwbuttonlampid, lpbuttoninfo.rawAddress.toCPointer<ByteVar>())

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(hphone, dwbuttonlampid, lpbuttoninfo.rawAddress.toCPointer<ByteVar>())

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: ConstPtr<CVoid>, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetData(hphone, dwdataid, lpdata.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetDisplay(hphone, dwrow, dwcolumn, lpsdisplay.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetGain(hphone, dwhookswitchdev, dwgain)

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone, dwhookswitchdevs, dwhookswitchmode)

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone, dwbuttonlampid, dwlampmode)

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetRing(hphone, dwringmode, dwvolume)

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone, dwphonestates, dwbuttonmodes, dwbuttonstates)

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone, dwhookswitchdev, dwvolume)

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    windowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp)

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    windowssysWindowsWin32DevicesTapiTapiGetLocationInfo(lpszcountrycode.rawAddress.toCPointer<ByteVar>(), lpszcitycode.rawAddress.toCPointer<ByteVar>())

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(lpszcountrycode.rawAddress.toCPointer<ByteVar>(), lpszcitycode.rawAddress.toCPointer<ByteVar>())

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(lpszcountrycodew.rawAddress.toCPointer<ByteVar>(), lpszcitycodew.rawAddress.toCPointer<ByteVar>())

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestDrop(hwnd.rawAddress.toCPointer<ByteVar>(), wrequestid)

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestMakeCall(lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpszcalledparty.rawAddress.toCPointer<ByteVar>(), lpszcomment.rawAddress.toCPointer<ByteVar>())

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpszcalledparty.rawAddress.toCPointer<ByteVar>(), lpszcomment.rawAddress.toCPointer<ByteVar>())

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpszcalledparty.rawAddress.toCPointer<ByteVar>(), lpszcomment.rawAddress.toCPointer<ByteVar>())

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestMediaCall(hwnd.rawAddress.toCPointer<ByteVar>(), wrequestid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lpdeviceid.rawAddress.toCPointer<ByteVar>(), dwsize, dwsecure, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpszcalledparty.rawAddress.toCPointer<ByteVar>(), lpszcomment.rawAddress.toCPointer<ByteVar>())

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(hwnd.rawAddress.toCPointer<ByteVar>(), wrequestid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lpdeviceid.rawAddress.toCPointer<ByteVar>(), dwsize, dwsecure, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpszcalledparty.rawAddress.toCPointer<ByteVar>(), lpszcomment.rawAddress.toCPointer<ByteVar>())

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(hwnd.rawAddress.toCPointer<ByteVar>(), wrequestid, lpszdeviceclass.rawAddress.toCPointer<ByteVar>(), lpdeviceid.rawAddress.toCPointer<ByteVar>(), dwsize, dwsecure, lpszdestaddress.rawAddress.toCPointer<ByteVar>(), lpszappname.rawAddress.toCPointer<ByteVar>(), lpszcalledparty.rawAddress.toCPointer<ByteVar>(), lpszcomment.rawAddress.toCPointer<ByteVar>())
