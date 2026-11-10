@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY

public data class Addralias(
    public var rgchName: ByteArray = ByteArray(41),
    public var rgchEName: ByteArray = ByteArray(11),
    public var rgchSrvr: ByteArray = ByteArray(12),
    public var dibDetail: UInt = 0u,
    public var type: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addralias) return false
        if (!this.rgchName.contentEquals(other.rgchName)) return false
        if (!this.rgchEName.contentEquals(other.rgchEName)) return false
        if (!this.rgchSrvr.contentEquals(other.rgchSrvr)) return false
        if (this.dibDetail != other.dibDetail) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgchName.contentHashCode()
        result = 31 * result + this.rgchEName.contentHashCode()
        result = 31 * result + this.rgchSrvr.contentHashCode()
        result = 31 * result + this.dibDetail.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }
}

public data class Dtr(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
)

public class Lineaddresscaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwLineDeviceID: UInt = 0u,
    public var dwAddressSize: UInt = 0u,
    public var dwAddressOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwAddressSharing: UInt = 0u,
    public var dwAddressStates: UInt = 0u,
    public var dwCallInfoStates: UInt = 0u,
    public var dwCallerIDFlags: UInt = 0u,
    public var dwCalledIDFlags: UInt = 0u,
    public var dwConnectedIDFlags: UInt = 0u,
    public var dwRedirectionIDFlags: UInt = 0u,
    public var dwRedirectingIDFlags: UInt = 0u,
    public var dwCallStates: UInt = 0u,
    public var dwDialToneModes: UInt = 0u,
    public var dwBusyModes: UInt = 0u,
    public var dwSpecialInfo: UInt = 0u,
    public var dwDisconnectModes: UInt = 0u,
    public var dwMaxNumActiveCalls: UInt = 0u,
    public var dwMaxNumOnHoldCalls: UInt = 0u,
    public var dwMaxNumOnHoldPendingCalls: UInt = 0u,
    public var dwMaxNumConference: UInt = 0u,
    public var dwMaxNumTransConf: UInt = 0u,
    public var dwAddrCapFlags: UInt = 0u,
    public var dwCallFeatures: UInt = 0u,
    public var dwRemoveFromConfCaps: UInt = 0u,
    public var dwRemoveFromConfState: UInt = 0u,
    public var dwTransferModes: UInt = 0u,
    public var dwParkModes: UInt = 0u,
    public var dwForwardModes: UInt = 0u,
    public var dwMaxForwardEntries: UInt = 0u,
    public var dwMaxSpecificEntries: UInt = 0u,
    public var dwMinFwdNumRings: UInt = 0u,
    public var dwMaxFwdNumRings: UInt = 0u,
    public var dwMaxCallCompletions: UInt = 0u,
    public var dwCallCompletionConds: UInt = 0u,
    public var dwCallCompletionModes: UInt = 0u,
    public var dwNumCompletionMessages: UInt = 0u,
    public var dwCompletionMsgTextEntrySize: UInt = 0u,
    public var dwCompletionMsgTextSize: UInt = 0u,
    public var dwCompletionMsgTextOffset: UInt = 0u,
    public var dwAddressFeatures: UInt = 0u,
    public var dwPredictiveAutoTransferStates: UInt = 0u,
    public var dwNumCallTreatments: UInt = 0u,
    public var dwCallTreatmentListSize: UInt = 0u,
    public var dwCallTreatmentListOffset: UInt = 0u,
    public var dwDeviceClassesSize: UInt = 0u,
    public var dwDeviceClassesOffset: UInt = 0u,
    public var dwMaxCallDataSize: UInt = 0u,
    public var dwCallFeatures2: UInt = 0u,
    public var dwMaxNoAnswerTimeout: UInt = 0u,
    public var dwConnectedModes: UInt = 0u,
    public var dwOfferingModes: UInt = 0u,
    public var dwAvailableMediaModes: UInt = 0u,
)

public data class Lineaddressstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumInUse: UInt = 0u,
    public var dwNumActiveCalls: UInt = 0u,
    public var dwNumOnHoldCalls: UInt = 0u,
    public var dwNumOnHoldPendCalls: UInt = 0u,
    public var dwAddressFeatures: UInt = 0u,
    public var dwNumRingsNoAnswer: UInt = 0u,
    public var dwForwardNumEntries: UInt = 0u,
    public var dwForwardSize: UInt = 0u,
    public var dwForwardOffset: UInt = 0u,
    public var dwTerminalModesSize: UInt = 0u,
    public var dwTerminalModesOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
)

public data class Lineagentactivityentry(
    public var dwID: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
)

public data class Lineagentactivitylist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class Lineagentcaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentHandlerInfoSize: UInt = 0u,
    public var dwAgentHandlerInfoOffset: UInt = 0u,
    public var dwCapsVersion: UInt = 0u,
    public var dwFeatures: UInt = 0u,
    public var dwStates: UInt = 0u,
    public var dwNextStates: UInt = 0u,
    public var dwMaxNumGroupEntries: UInt = 0u,
    public var dwAgentStatusMessages: UInt = 0u,
    public var dwNumAgentExtensionIDs: UInt = 0u,
    public var dwAgentExtensionIDListSize: UInt = 0u,
    public var dwAgentExtensionIDListOffset: UInt = 0u,
    public var proxyGUID: Guid = Guid(),
)

public data class Lineagententry(
    public var hAgent: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
    public var dwIDSize: UInt = 0u,
    public var dwIDOffset: UInt = 0u,
    public var dwPINSize: UInt = 0u,
    public var dwPINOffset: UInt = 0u,
)

public data class Lineagentgroupentry(
    public var groupID: Lineagentgroupentry0 = Lineagentgroupentry0(),
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
)

public data class Lineagentgroupentry0(
    public var dwGroupID1: UInt = 0u,
    public var dwGroupID2: UInt = 0u,
    public var dwGroupID3: UInt = 0u,
    public var dwGroupID4: UInt = 0u,
)

public data class Lineagentgrouplist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class Lineagentinfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
    public var cyOverallCallRate: CY = CY(),
    public var dwNumberOfACDCalls: UInt = 0u,
    public var dwNumberOfIncomingCalls: UInt = 0u,
    public var dwNumberOfOutgoingCalls: UInt = 0u,
    public var dwTotalACDTalkTime: UInt = 0u,
    public var dwTotalACDCallTime: UInt = 0u,
    public var dwTotalACDWrapUpTime: UInt = 0u,
)

public data class Lineagentlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class Lineagentsessionentry(
    public var hAgentSession: UInt = 0u,
    public var hAgent: UInt = 0u,
    public var groupID: Guid = Guid(),
    public var dwWorkingAddressID: UInt = 0u,
)

public class Lineagentsessioninfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentSessionState: UInt = 0u,
    public var dwNextAgentSessionState: UInt = 0u,
    public var dateSessionStartTime: Double = 0.0,
    public var dwSessionDuration: UInt = 0u,
    public var dwNumberOfCalls: UInt = 0u,
    public var dwTotalTalkTime: UInt = 0u,
    public var dwAverageTalkTime: UInt = 0u,
    public var dwTotalCallTime: UInt = 0u,
    public var dwAverageCallTime: UInt = 0u,
    public var dwTotalWrapUpTime: UInt = 0u,
    public var dwAverageWrapUpTime: UInt = 0u,
    public var cyACDCallRate: CY = CY(),
    public var dwLongestTimeToAnswer: UInt = 0u,
    public var dwAverageTimeToAnswer: UInt = 0u,
)

public data class Lineagentsessionlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class Lineagentstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwGroupListSize: UInt = 0u,
    public var dwGroupListOffset: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwNextState: UInt = 0u,
    public var dwActivityID: UInt = 0u,
    public var dwActivitySize: UInt = 0u,
    public var dwActivityOffset: UInt = 0u,
    public var dwAgentFeatures: UInt = 0u,
    public var dwValidStates: UInt = 0u,
    public var dwValidNextStates: UInt = 0u,
)

public data class Lineappinfo(
    public var dwMachineNameSize: UInt = 0u,
    public var dwMachineNameOffset: UInt = 0u,
    public var dwUserNameSize: UInt = 0u,
    public var dwUserNameOffset: UInt = 0u,
    public var dwModuleFilenameSize: UInt = 0u,
    public var dwModuleFilenameOffset: UInt = 0u,
    public var dwFriendlyNameSize: UInt = 0u,
    public var dwFriendlyNameOffset: UInt = 0u,
    public var dwMediaModes: UInt = 0u,
    public var dwAddressID: UInt = 0u,
)

public class Linecallinfo {
    public var dwTotalSize: UInt = 0u

    public var dwNeededSize: UInt = 0u

    public var dwUsedSize: UInt = 0u

    public var hLine: UInt = 0u

    public var dwLineDeviceID: UInt = 0u

    public var dwAddressID: UInt = 0u

    public var dwBearerMode: UInt = 0u

    public var dwRate: UInt = 0u

    public var dwMediaMode: UInt = 0u

    public var dwAppSpecific: UInt = 0u

    public var dwCallID: UInt = 0u

    public var dwRelatedCallID: UInt = 0u

    public var dwCallParamFlags: UInt = 0u

    public var dwCallStates: UInt = 0u

    public var dwMonitorDigitModes: UInt = 0u

    public var dwMonitorMediaModes: UInt = 0u

    public var dialParams: Linedialparams = Linedialparams()

    public var dwOrigin: UInt = 0u

    public var dwReason: UInt = 0u

    public var dwCompletionID: UInt = 0u

    public var dwNumOwners: UInt = 0u

    public var dwNumMonitors: UInt = 0u

    public var dwCountryCode: UInt = 0u

    public var dwTrunk: UInt = 0u

    public var dwCallerIDFlags: UInt = 0u

    public var dwCallerIDSize: UInt = 0u

    public var dwCallerIDOffset: UInt = 0u

    public var dwCallerIDNameSize: UInt = 0u

    public var dwCallerIDNameOffset: UInt = 0u

    public var dwCalledIDFlags: UInt = 0u

    public var dwCalledIDSize: UInt = 0u

    public var dwCalledIDOffset: UInt = 0u

    public var dwCalledIDNameSize: UInt = 0u

    public var dwCalledIDNameOffset: UInt = 0u

    public var dwConnectedIDFlags: UInt = 0u

    public var dwConnectedIDSize: UInt = 0u

    public var dwConnectedIDOffset: UInt = 0u

    public var dwConnectedIDNameSize: UInt = 0u

    public var dwConnectedIDNameOffset: UInt = 0u

    public var dwRedirectionIDFlags: UInt = 0u

    public var dwRedirectionIDSize: UInt = 0u

    public var dwRedirectionIDOffset: UInt = 0u

    public var dwRedirectionIDNameSize: UInt = 0u

    public var dwRedirectionIDNameOffset: UInt = 0u

    public var dwRedirectingIDFlags: UInt = 0u

    public var dwRedirectingIDSize: UInt = 0u

    public var dwRedirectingIDOffset: UInt = 0u

    public var dwRedirectingIDNameSize: UInt = 0u

    public var dwRedirectingIDNameOffset: UInt = 0u

    public var dwAppNameSize: UInt = 0u

    public var dwAppNameOffset: UInt = 0u

    public var dwDisplayableAddressSize: UInt = 0u

    public var dwDisplayableAddressOffset: UInt = 0u

    public var dwCalledPartySize: UInt = 0u

    public var dwCalledPartyOffset: UInt = 0u

    public var dwCommentSize: UInt = 0u

    public var dwCommentOffset: UInt = 0u

    public var dwDisplaySize: UInt = 0u

    public var dwDisplayOffset: UInt = 0u

    public var dwUserUserInfoSize: UInt = 0u

    public var dwUserUserInfoOffset: UInt = 0u

    public var dwHighLevelCompSize: UInt = 0u

    public var dwHighLevelCompOffset: UInt = 0u

    public var dwLowLevelCompSize: UInt = 0u

    public var dwLowLevelCompOffset: UInt = 0u

    public var dwChargingInfoSize: UInt = 0u

    public var dwChargingInfoOffset: UInt = 0u

    public var dwTerminalModesSize: UInt = 0u

    public var dwTerminalModesOffset: UInt = 0u

    public var dwDevSpecificSize: UInt = 0u

    public var dwDevSpecificOffset: UInt = 0u

    public var dwCallTreatment: UInt = 0u

    public var dwCallDataSize: UInt = 0u

    public var dwCallDataOffset: UInt = 0u

    public var dwSendingFlowspecSize: UInt = 0u

    public var dwSendingFlowspecOffset: UInt = 0u

    public var dwReceivingFlowspecSize: UInt = 0u

    public var dwReceivingFlowspecOffset: UInt = 0u
}

public data class Linecalllist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwCallsNumEntries: UInt = 0u,
    public var dwCallsSize: UInt = 0u,
    public var dwCallsOffset: UInt = 0u,
)

public class Linecallparams(
    public var dwTotalSize: UInt = 0u,
    public var dwBearerMode: UInt = 0u,
    public var dwMinRate: UInt = 0u,
    public var dwMaxRate: UInt = 0u,
    public var dwMediaMode: UInt = 0u,
    public var dwCallParamFlags: UInt = 0u,
    public var dwAddressMode: UInt = 0u,
    public var dwAddressID: UInt = 0u,
    public var dialParams: Linedialparams = Linedialparams(),
    public var dwOrigAddressSize: UInt = 0u,
    public var dwOrigAddressOffset: UInt = 0u,
    public var dwDisplayableAddressSize: UInt = 0u,
    public var dwDisplayableAddressOffset: UInt = 0u,
    public var dwCalledPartySize: UInt = 0u,
    public var dwCalledPartyOffset: UInt = 0u,
    public var dwCommentSize: UInt = 0u,
    public var dwCommentOffset: UInt = 0u,
    public var dwUserUserInfoSize: UInt = 0u,
    public var dwUserUserInfoOffset: UInt = 0u,
    public var dwHighLevelCompSize: UInt = 0u,
    public var dwHighLevelCompOffset: UInt = 0u,
    public var dwLowLevelCompSize: UInt = 0u,
    public var dwLowLevelCompOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwPredictiveAutoTransferStates: UInt = 0u,
    public var dwTargetAddressSize: UInt = 0u,
    public var dwTargetAddressOffset: UInt = 0u,
    public var dwSendingFlowspecSize: UInt = 0u,
    public var dwSendingFlowspecOffset: UInt = 0u,
    public var dwReceivingFlowspecSize: UInt = 0u,
    public var dwReceivingFlowspecOffset: UInt = 0u,
    public var dwDeviceClassSize: UInt = 0u,
    public var dwDeviceClassOffset: UInt = 0u,
    public var dwDeviceConfigSize: UInt = 0u,
    public var dwDeviceConfigOffset: UInt = 0u,
    public var dwCallDataSize: UInt = 0u,
    public var dwCallDataOffset: UInt = 0u,
    public var dwNoAnswerTimeout: UInt = 0u,
    public var dwCallingPartyIDSize: UInt = 0u,
    public var dwCallingPartyIDOffset: UInt = 0u,
)

public data class Linecallstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwCallState: UInt = 0u,
    public var dwCallStateMode: UInt = 0u,
    public var dwCallPrivilege: UInt = 0u,
    public var dwCallFeatures: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwCallFeatures2: UInt = 0u,
    public var tStateEntryTime: Systemtime = Systemtime(),
)

public data class Linecalltreatmententry(
    public var dwCallTreatmentID: UInt = 0u,
    public var dwCallTreatmentNameSize: UInt = 0u,
    public var dwCallTreatmentNameOffset: UInt = 0u,
)

public data class Linecardentry(
    public var dwPermanentCardID: UInt = 0u,
    public var dwCardNameSize: UInt = 0u,
    public var dwCardNameOffset: UInt = 0u,
    public var dwCardNumberDigits: UInt = 0u,
    public var dwSameAreaRuleSize: UInt = 0u,
    public var dwSameAreaRuleOffset: UInt = 0u,
    public var dwLongDistanceRuleSize: UInt = 0u,
    public var dwLongDistanceRuleOffset: UInt = 0u,
    public var dwInternationalRuleSize: UInt = 0u,
    public var dwInternationalRuleOffset: UInt = 0u,
    public var dwOptions: UInt = 0u,
)

public data class Linecountryentry(
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwNextCountryID: UInt = 0u,
    public var dwCountryNameSize: UInt = 0u,
    public var dwCountryNameOffset: UInt = 0u,
    public var dwSameAreaRuleSize: UInt = 0u,
    public var dwSameAreaRuleOffset: UInt = 0u,
    public var dwLongDistanceRuleSize: UInt = 0u,
    public var dwLongDistanceRuleOffset: UInt = 0u,
    public var dwInternationalRuleSize: UInt = 0u,
    public var dwInternationalRuleOffset: UInt = 0u,
)

public data class Linecountrylist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumCountries: UInt = 0u,
    public var dwCountryListSize: UInt = 0u,
    public var dwCountryListOffset: UInt = 0u,
)

public class Linedevcaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwProviderInfoSize: UInt = 0u,
    public var dwProviderInfoOffset: UInt = 0u,
    public var dwSwitchInfoSize: UInt = 0u,
    public var dwSwitchInfoOffset: UInt = 0u,
    public var dwPermanentLineID: UInt = 0u,
    public var dwLineNameSize: UInt = 0u,
    public var dwLineNameOffset: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwAddressModes: UInt = 0u,
    public var dwNumAddresses: UInt = 0u,
    public var dwBearerModes: UInt = 0u,
    public var dwMaxRate: UInt = 0u,
    public var dwMediaModes: UInt = 0u,
    public var dwGenerateToneModes: UInt = 0u,
    public var dwGenerateToneMaxNumFreq: UInt = 0u,
    public var dwGenerateDigitModes: UInt = 0u,
    public var dwMonitorToneMaxNumFreq: UInt = 0u,
    public var dwMonitorToneMaxNumEntries: UInt = 0u,
    public var dwMonitorDigitModes: UInt = 0u,
    public var dwGatherDigitsMinTimeout: UInt = 0u,
    public var dwGatherDigitsMaxTimeout: UInt = 0u,
    public var dwMedCtlDigitMaxListSize: UInt = 0u,
    public var dwMedCtlMediaMaxListSize: UInt = 0u,
    public var dwMedCtlToneMaxListSize: UInt = 0u,
    public var dwMedCtlCallStateMaxListSize: UInt = 0u,
    public var dwDevCapFlags: UInt = 0u,
    public var dwMaxNumActiveCalls: UInt = 0u,
    public var dwAnswerMode: UInt = 0u,
    public var dwRingModes: UInt = 0u,
    public var dwLineStates: UInt = 0u,
    public var dwUUIAcceptSize: UInt = 0u,
    public var dwUUIAnswerSize: UInt = 0u,
    public var dwUUIMakeCallSize: UInt = 0u,
    public var dwUUIDropSize: UInt = 0u,
    public var dwUUISendUserUserInfoSize: UInt = 0u,
    public var dwUUICallInfoSize: UInt = 0u,
    public var minDialParams: Linedialparams = Linedialparams(),
    public var maxDialParams: Linedialparams = Linedialparams(),
    public var defaultDialParams: Linedialparams = Linedialparams(),
    public var dwNumTerminals: UInt = 0u,
    public var dwTerminalCapsSize: UInt = 0u,
    public var dwTerminalCapsOffset: UInt = 0u,
    public var dwTerminalTextEntrySize: UInt = 0u,
    public var dwTerminalTextSize: UInt = 0u,
    public var dwTerminalTextOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwLineFeatures: UInt = 0u,
    public var dwSettableDevStatus: UInt = 0u,
    public var dwDeviceClassesSize: UInt = 0u,
    public var dwDeviceClassesOffset: UInt = 0u,
    public var permanentLineGuid: Guid = Guid(),
)

public class Linedevstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumOpens: UInt = 0u,
    public var dwOpenMediaModes: UInt = 0u,
    public var dwNumActiveCalls: UInt = 0u,
    public var dwNumOnHoldCalls: UInt = 0u,
    public var dwNumOnHoldPendCalls: UInt = 0u,
    public var dwLineFeatures: UInt = 0u,
    public var dwNumCallCompletions: UInt = 0u,
    public var dwRingMode: UInt = 0u,
    public var dwSignalLevel: UInt = 0u,
    public var dwBatteryLevel: UInt = 0u,
    public var dwRoamMode: UInt = 0u,
    public var dwDevStatusFlags: UInt = 0u,
    public var dwTerminalModesSize: UInt = 0u,
    public var dwTerminalModesOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwAvailableMediaModes: UInt = 0u,
    public var dwAppInfoSize: UInt = 0u,
    public var dwAppInfoOffset: UInt = 0u,
)

public data class Linedialparams(
    public var dwDialPause: UInt = 0u,
    public var dwDialSpeed: UInt = 0u,
    public var dwDigitDuration: UInt = 0u,
    public var dwWaitForDialtone: UInt = 0u,
)

public data class Lineextensionid(
    public var dwExtensionID0: UInt = 0u,
    public var dwExtensionID1: UInt = 0u,
    public var dwExtensionID2: UInt = 0u,
    public var dwExtensionID3: UInt = 0u,
)

public data class Lineforward(
    public var dwForwardMode: UInt = 0u,
    public var dwCallerAddressSize: UInt = 0u,
    public var dwCallerAddressOffset: UInt = 0u,
    public var dwDestCountryCode: UInt = 0u,
    public var dwDestAddressSize: UInt = 0u,
    public var dwDestAddressOffset: UInt = 0u,
)

public data class Lineforwardlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var forwardList: List<Lineforward> = List(1) { Lineforward() },
)

public data class Linegeneratetone(
    public var dwFrequency: UInt = 0u,
    public var dwCadenceOn: UInt = 0u,
    public var dwCadenceOff: UInt = 0u,
    public var dwVolume: UInt = 0u,
)

public data class Lineinitializeexparams(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var handles: Lineinitializeexparams0 = Lineinitializeexparams0(),
    public var dwCompletionKey: UInt = 0u,
)

public data class Lineinitializeexparams0(
    public var hEvent: Handle = null,
    public var hCompletionPort: Handle = null,
)

public class Linelocationentry(
    public var dwPermanentLocationID: UInt = 0u,
    public var dwLocationNameSize: UInt = 0u,
    public var dwLocationNameOffset: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwCityCodeSize: UInt = 0u,
    public var dwCityCodeOffset: UInt = 0u,
    public var dwPreferredCardID: UInt = 0u,
    public var dwLocalAccessCodeSize: UInt = 0u,
    public var dwLocalAccessCodeOffset: UInt = 0u,
    public var dwLongDistanceAccessCodeSize: UInt = 0u,
    public var dwLongDistanceAccessCodeOffset: UInt = 0u,
    public var dwTollPrefixListSize: UInt = 0u,
    public var dwTollPrefixListOffset: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwCancelCallWaitingSize: UInt = 0u,
    public var dwCancelCallWaitingOffset: UInt = 0u,
)

public data class Linemediacontrolcallstate(
    public var dwCallStates: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class Linemediacontroldigit(
    public var dwDigit: UInt = 0u,
    public var dwDigitModes: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class Linemediacontrolmedia(
    public var dwMediaModes: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class Linemediacontroltone(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class Linemessage(
    public var hDevice: UInt = 0u,
    public var dwMessageID: UInt = 0u,
    public var dwCallbackInstance: Int = 0,
    public var dwParam1: Int = 0,
    public var dwParam2: Int = 0,
    public var dwParam3: Int = 0,
)

public data class Linemonitortone(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
)

public data class Lineproviderentry(
    public var dwPermanentProviderID: UInt = 0u,
    public var dwProviderFilenameSize: UInt = 0u,
    public var dwProviderFilenameOffset: UInt = 0u,
)

public data class Lineproviderlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumProviders: UInt = 0u,
    public var dwProviderListSize: UInt = 0u,
    public var dwProviderListOffset: UInt = 0u,
)

public data class Lineproxyrequest(
    public var dwSize: UInt = 0u,
    public var dwClientMachineNameSize: UInt = 0u,
    public var dwClientMachineNameOffset: UInt = 0u,
    public var dwClientUserNameSize: UInt = 0u,
    public var dwClientUserNameOffset: UInt = 0u,
    public var dwClientAppAPIVersion: UInt = 0u,
    public var dwRequestType: UInt = 0u,
    public var anonymous: Lineproxyrequest0 = Lineproxyrequest0(),
)

public class Lineproxyrequest0(
    public var setAgentGroup: Lineproxyrequest00 = Lineproxyrequest00(),
    public var setAgentState: Lineproxyrequest01 = Lineproxyrequest01(),
    public var setAgentActivity: Lineproxyrequest02 = Lineproxyrequest02(),
    public var getAgentCaps: Lineproxyrequest03 = Lineproxyrequest03(),
    public var getAgentStatus: Lineproxyrequest04 = Lineproxyrequest04(),
    public var agentSpecific: Lineproxyrequest05 = Lineproxyrequest05(),
    public var getAgentActivityList: Lineproxyrequest06 = Lineproxyrequest06(),
    public var getAgentGroupList: Lineproxyrequest07 = Lineproxyrequest07(),
    public var createAgent: Lineproxyrequest08 = Lineproxyrequest08(),
    public var setAgentStateEx: Lineproxyrequest09 = Lineproxyrequest09(),
    public var setAgentMeasurementPeriod: Lineproxyrequest010 = Lineproxyrequest010(),
    public var getAgentInfo: Lineproxyrequest011 = Lineproxyrequest011(),
    public var createAgentSession: Lineproxyrequest012 = Lineproxyrequest012(),
    public var getAgentSessionList: Lineproxyrequest013 = Lineproxyrequest013(),
    public var getAgentSessionInfo: Lineproxyrequest014 = Lineproxyrequest014(),
    public var setAgentSessionState: Lineproxyrequest015 = Lineproxyrequest015(),
    public var getQueueList: Lineproxyrequest016 = Lineproxyrequest016(),
    public var setQueueMeasurementPeriod: Lineproxyrequest017 = Lineproxyrequest017(),
    public var getQueueInfo: Lineproxyrequest018 = Lineproxyrequest018(),
    public var getGroupList: Lineproxyrequest019 = Lineproxyrequest019(),
)

public data class Lineproxyrequest05(
    public var dwAddressID: UInt = 0u,
    public var dwAgentExtensionIDIndex: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var params: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lineproxyrequest05) return false
        if (this.dwAddressID != other.dwAddressID) return false
        if (this.dwAgentExtensionIDIndex != other.dwAgentExtensionIDIndex) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.params.contentEquals(other.params)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAddressID.hashCode()
        result = 31 * result + this.dwAgentExtensionIDIndex.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.params.contentHashCode()
        return result
    }
}

public data class Lineproxyrequest012(
    public var hAgentSession: UInt = 0u,
    public var dwAgentPINSize: UInt = 0u,
    public var dwAgentPINOffset: UInt = 0u,
    public var hAgent: UInt = 0u,
    public var groupID: Guid = Guid(),
    public var dwWorkingAddressID: UInt = 0u,
)

public data class Lineproxyrequest08(
    public var hAgent: UInt = 0u,
    public var dwAgentIDSize: UInt = 0u,
    public var dwAgentIDOffset: UInt = 0u,
    public var dwAgentPINSize: UInt = 0u,
    public var dwAgentPINOffset: UInt = 0u,
)

public data class Lineproxyrequest06(
    public var dwAddressID: UInt = 0u,
    public var activityList: Lineagentactivitylist = Lineagentactivitylist(),
)

public data class Lineproxyrequest03(
    public var dwAddressID: UInt = 0u,
    public var agentCaps: Lineagentcaps = Lineagentcaps(),
)

public data class Lineproxyrequest07(
    public var dwAddressID: UInt = 0u,
    public var groupList: Lineagentgrouplist = Lineagentgrouplist(),
)

public data class Lineproxyrequest011(
    public var hAgent: UInt = 0u,
    public var agentInfo: Lineagentinfo = Lineagentinfo(),
)

public data class Lineproxyrequest014(
    public var hAgentSession: UInt = 0u,
    public var sessionInfo: Lineagentsessioninfo = Lineagentsessioninfo(),
)

public data class Lineproxyrequest013(
    public var hAgent: UInt = 0u,
    public var sessionList: Lineagentsessionlist = Lineagentsessionlist(),
)

public data class Lineproxyrequest04(
    public var dwAddressID: UInt = 0u,
    public var agentStatus: Lineagentstatus = Lineagentstatus(),
)

public data class Lineproxyrequest019(
    public var groupList: Lineagentgrouplist = Lineagentgrouplist(),
)

public data class Lineproxyrequest018(
    public var dwQueueID: UInt = 0u,
    public var queueInfo: Linequeueinfo = Linequeueinfo(),
)

public data class Lineproxyrequest016(
    public var groupID: Guid = Guid(),
    public var queueList: Linequeuelist = Linequeuelist(),
)

public data class Lineproxyrequest02(
    public var dwAddressID: UInt = 0u,
    public var dwActivityID: UInt = 0u,
)

public data class Lineproxyrequest00(
    public var dwAddressID: UInt = 0u,
    public var groupList: Lineagentgrouplist = Lineagentgrouplist(),
)

public data class Lineproxyrequest010(
    public var hAgent: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
)

public data class Lineproxyrequest015(
    public var hAgentSession: UInt = 0u,
    public var dwAgentSessionState: UInt = 0u,
    public var dwNextAgentSessionState: UInt = 0u,
)

public data class Lineproxyrequest09(
    public var hAgent: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
)

public data class Lineproxyrequest01(
    public var dwAddressID: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
)

public data class Lineproxyrequest017(
    public var dwQueueID: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
)

public data class Lineproxyrequestlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class Linequeueentry(
    public var dwQueueID: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
)

public data class Linequeueinfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
    public var dwTotalCallsQueued: UInt = 0u,
    public var dwCurrentCallsQueued: UInt = 0u,
    public var dwTotalCallsAbandoned: UInt = 0u,
    public var dwTotalCallsFlowedIn: UInt = 0u,
    public var dwTotalCallsFlowedOut: UInt = 0u,
    public var dwLongestEverWaitTime: UInt = 0u,
    public var dwCurrentLongestWaitTime: UInt = 0u,
    public var dwAverageWaitTime: UInt = 0u,
    public var dwFinalDisposition: UInt = 0u,
)

public data class Linequeuelist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class Linereqmakecall(
    public var szDestAddress: ByteArray = ByteArray(80),
    public var szAppName: ByteArray = ByteArray(40),
    public var szCalledParty: ByteArray = ByteArray(40),
    public var szComment: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmakecall) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }
}

public data class Linereqmakecallw(
    public var szDestAddress: UShortArray = UShortArray(80),
    public var szAppName: UShortArray = UShortArray(40),
    public var szCalledParty: UShortArray = UShortArray(40),
    public var szComment: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmakecallw) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }
}

public data class Linereqmediacall(
    public var hWnd: Hwnd = null,
    public var wRequestID: Wparam = 0uL,
    public var szDeviceClass: ByteArray = ByteArray(40),
    public var ucDeviceID: UByteArray = UByteArray(40),
    public var dwSize: UInt = 0u,
    public var dwSecure: UInt = 0u,
    public var szDestAddress: ByteArray = ByteArray(80),
    public var szAppName: ByteArray = ByteArray(40),
    public var szCalledParty: ByteArray = ByteArray(40),
    public var szComment: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmediacall) return false
        if (this.hWnd != other.hWnd) return false
        if (this.wRequestID != other.wRequestID) return false
        if (!this.szDeviceClass.contentEquals(other.szDeviceClass)) return false
        if (!this.ucDeviceID.contentEquals(other.ucDeviceID)) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSecure != other.dwSecure) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.wRequestID.hashCode()
        result = 31 * result + this.szDeviceClass.contentHashCode()
        result = 31 * result + this.ucDeviceID.contentHashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwSecure.hashCode()
        result = 31 * result + this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }
}

public data class Linereqmediacallw(
    public var hWnd: Hwnd = null,
    public var wRequestID: Wparam = 0uL,
    public var szDeviceClass: UShortArray = UShortArray(40),
    public var ucDeviceID: UByteArray = UByteArray(40),
    public var dwSize: UInt = 0u,
    public var dwSecure: UInt = 0u,
    public var szDestAddress: UShortArray = UShortArray(80),
    public var szAppName: UShortArray = UShortArray(40),
    public var szCalledParty: UShortArray = UShortArray(40),
    public var szComment: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmediacallw) return false
        if (this.hWnd != other.hWnd) return false
        if (this.wRequestID != other.wRequestID) return false
        if (!this.szDeviceClass.contentEquals(other.szDeviceClass)) return false
        if (!this.ucDeviceID.contentEquals(other.ucDeviceID)) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSecure != other.dwSecure) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.wRequestID.hashCode()
        result = 31 * result + this.szDeviceClass.contentHashCode()
        result = 31 * result + this.ucDeviceID.contentHashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwSecure.hashCode()
        result = 31 * result + this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }
}

public data class Linetermcaps(
    public var dwTermDev: UInt = 0u,
    public var dwTermModes: UInt = 0u,
    public var dwTermSharing: UInt = 0u,
)

public data class Linetranslatecaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumLocations: UInt = 0u,
    public var dwLocationListSize: UInt = 0u,
    public var dwLocationListOffset: UInt = 0u,
    public var dwCurrentLocationID: UInt = 0u,
    public var dwNumCards: UInt = 0u,
    public var dwCardListSize: UInt = 0u,
    public var dwCardListOffset: UInt = 0u,
    public var dwCurrentPreferredCardID: UInt = 0u,
)

public data class Linetranslateoutput(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwDialableStringSize: UInt = 0u,
    public var dwDialableStringOffset: UInt = 0u,
    public var dwDisplayableStringSize: UInt = 0u,
    public var dwDisplayableStringOffset: UInt = 0u,
    public var dwCurrentCountry: UInt = 0u,
    public var dwDestCountry: UInt = 0u,
    public var dwTranslateResults: UInt = 0u,
)

public data class MspEventInfo(
    public var dwSize: UInt = 0u,
    public var event: MspEvent = 0,
    public var hCall: Int? = null,
    public var anonymous: MspEventInfo0 = MspEventInfo0(),
)

public data class MspEventInfo0(
    public var mspAddressEventInfo: MspEventInfo00 = MspEventInfo00(),
    public var mspCallEventInfo: MspEventInfo01 = MspEventInfo01(),
    public var mspTspData: MspEventInfo02 = MspEventInfo02(),
    public var mspPrivateEventInfo: MspEventInfo03 = MspEventInfo03(),
    public var mspFileTerminalEventInfo: MspEventInfo04 = MspEventInfo04(),
    public var mspAsrTerminalEventInfo: MspEventInfo05 = MspEventInfo05(),
    public var mspTtsTerminalEventInfo: MspEventInfo06 = MspEventInfo06(),
    public var mspToneTerminalEventInfo: MspEventInfo07 = MspEventInfo07(),
)

public data class MspEventInfo00(
    public var type: MspAddressEvent = 0,
    public var pTerminal: COpaquePointer? = null,
)

public data class MspEventInfo05(
    public var pASRTerminal: COpaquePointer? = null,
    public var hrErrorCode: Hresult = 0,
)

public data class MspEventInfo01(
    public var type: MspCallEvent = 0,
    public var cause: MspCallEventCause = 0,
    public var pStream: COpaquePointer? = null,
    public var pTerminal: COpaquePointer? = null,
    public var hrError: Hresult = 0,
)

public data class MspEventInfo04(
    public var pParentFileTerminal: COpaquePointer? = null,
    public var pFileTrack: COpaquePointer? = null,
    public var terminalMediaState: TerminalMediaState = 0,
    public var ftecEventCause: FtStateEventCause = 0,
    public var hrErrorCode: Hresult = 0,
)

public data class MspEventInfo03(
    public var pEvent: COpaquePointer? = null,
    public var lEventCode: Int = 0,
)

public data class MspEventInfo07(
    public var pToneTerminal: COpaquePointer? = null,
    public var hrErrorCode: Hresult = 0,
)

public data class MspEventInfo02(
    public var dwBufferSize: UInt = 0u,
    public var pBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo02) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (!this.pBuffer.contentEquals(other.pBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwBufferSize.hashCode()
        result = 31 * result + this.pBuffer.contentHashCode()
        return result
    }
}

public data class MspEventInfo06(
    public var pTTSTerminal: COpaquePointer? = null,
    public var hrErrorCode: Hresult = 0,
)

public data class Nsid(
    public var dwSize: UInt = 0u,
    public var uchType: UByteArray = UByteArray(16),
    public var xtype: UInt = 0u,
    public var lTime: Int = 0,
    public var address: Nsid0 = Nsid0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nsid) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.uchType.contentEquals(other.uchType)) return false
        if (this.xtype != other.xtype) return false
        if (this.lTime != other.lTime) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.uchType.contentHashCode()
        result = 31 * result + this.xtype.hashCode()
        result = 31 * result + this.lTime.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }
}

public data class Nsid0(
    public var alias: Addralias = Addralias(),
    public var rgchInterNet: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nsid0) return false
        if (this.alias != other.alias) return false
        if (!this.rgchInterNet.contentEquals(other.rgchInterNet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alias.hashCode()
        result = 31 * result + this.rgchInterNet.contentHashCode()
        return result
    }
}

public data class Phonebuttoninfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwButtonMode: UInt = 0u,
    public var dwButtonFunction: UInt = 0u,
    public var dwButtonTextSize: UInt = 0u,
    public var dwButtonTextOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwButtonState: UInt = 0u,
)

public class Phonecaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwProviderInfoSize: UInt = 0u,
    public var dwProviderInfoOffset: UInt = 0u,
    public var dwPhoneInfoSize: UInt = 0u,
    public var dwPhoneInfoOffset: UInt = 0u,
    public var dwPermanentPhoneID: UInt = 0u,
    public var dwPhoneNameSize: UInt = 0u,
    public var dwPhoneNameOffset: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwPhoneStates: UInt = 0u,
    public var dwHookSwitchDevs: UInt = 0u,
    public var dwHandsetHookSwitchModes: UInt = 0u,
    public var dwSpeakerHookSwitchModes: UInt = 0u,
    public var dwHeadsetHookSwitchModes: UInt = 0u,
    public var dwVolumeFlags: UInt = 0u,
    public var dwGainFlags: UInt = 0u,
    public var dwDisplayNumRows: UInt = 0u,
    public var dwDisplayNumColumns: UInt = 0u,
    public var dwNumRingModes: UInt = 0u,
    public var dwNumButtonLamps: UInt = 0u,
    public var dwButtonModesSize: UInt = 0u,
    public var dwButtonModesOffset: UInt = 0u,
    public var dwButtonFunctionsSize: UInt = 0u,
    public var dwButtonFunctionsOffset: UInt = 0u,
    public var dwLampModesSize: UInt = 0u,
    public var dwLampModesOffset: UInt = 0u,
    public var dwNumSetData: UInt = 0u,
    public var dwSetDataSize: UInt = 0u,
    public var dwSetDataOffset: UInt = 0u,
    public var dwNumGetData: UInt = 0u,
    public var dwGetDataSize: UInt = 0u,
    public var dwGetDataOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwDeviceClassesSize: UInt = 0u,
    public var dwDeviceClassesOffset: UInt = 0u,
    public var dwPhoneFeatures: UInt = 0u,
    public var dwSettableHandsetHookSwitchModes: UInt = 0u,
    public var dwSettableSpeakerHookSwitchModes: UInt = 0u,
    public var dwSettableHeadsetHookSwitchModes: UInt = 0u,
    public var dwMonitoredHandsetHookSwitchModes: UInt = 0u,
    public var dwMonitoredSpeakerHookSwitchModes: UInt = 0u,
    public var dwMonitoredHeadsetHookSwitchModes: UInt = 0u,
    public var permanentPhoneGuid: Guid = Guid(),
)

public data class Phoneextensionid(
    public var dwExtensionID0: UInt = 0u,
    public var dwExtensionID1: UInt = 0u,
    public var dwExtensionID2: UInt = 0u,
    public var dwExtensionID3: UInt = 0u,
)

public data class Phoneinitializeexparams(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var handles: Phoneinitializeexparams0 = Phoneinitializeexparams0(),
    public var dwCompletionKey: UInt = 0u,
)

public data class Phoneinitializeexparams0(
    public var hEvent: Handle = null,
    public var hCompletionPort: Handle = null,
)

public data class Phonemessage(
    public var hDevice: UInt = 0u,
    public var dwMessageID: UInt = 0u,
    public var dwCallbackInstance: Int = 0,
    public var dwParam1: Int = 0,
    public var dwParam2: Int = 0,
    public var dwParam3: Int = 0,
)

public class Phonestatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwStatusFlags: UInt = 0u,
    public var dwNumOwners: UInt = 0u,
    public var dwNumMonitors: UInt = 0u,
    public var dwRingMode: UInt = 0u,
    public var dwRingVolume: UInt = 0u,
    public var dwHandsetHookSwitchMode: UInt = 0u,
    public var dwHandsetVolume: UInt = 0u,
    public var dwHandsetGain: UInt = 0u,
    public var dwSpeakerHookSwitchMode: UInt = 0u,
    public var dwSpeakerVolume: UInt = 0u,
    public var dwSpeakerGain: UInt = 0u,
    public var dwHeadsetHookSwitchMode: UInt = 0u,
    public var dwHeadsetVolume: UInt = 0u,
    public var dwHeadsetGain: UInt = 0u,
    public var dwDisplaySize: UInt = 0u,
    public var dwDisplayOffset: UInt = 0u,
    public var dwLampModesSize: UInt = 0u,
    public var dwLampModesOffset: UInt = 0u,
    public var dwOwnerNameSize: UInt = 0u,
    public var dwOwnerNameOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwPhoneFeatures: UInt = 0u,
)

public data class Renddata(
    public var atyp: UShort = 0u,
    public var ulPosition: UInt = 0u,
    public var dxWidth: UShort = 0u,
    public var dyHeight: UShort = 0u,
    public var dwFlags: UInt = 0u,
)

public data class STnefProblem(
    public var ulComponent: UInt = 0u,
    public var ulAttribute: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var scode: Int = 0,
)

public data class STnefProblemArray(
    public var cProblem: UInt = 0u,
    public var aProblem: List<STnefProblem> = List(1) { STnefProblem() },
)

public data class TapiCustomtone(
    public var dwFrequency: UInt = 0u,
    public var dwCadenceOn: UInt = 0u,
    public var dwCadenceOff: UInt = 0u,
    public var dwVolume: UInt = 0u,
)

public data class TapiDetecttone(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
)

public data class Trp(
    public var trpid: UShort = 0u,
    public var cbgrtrp: UShort = 0u,
    public var cch: UShort = 0u,
    public var cbRgb: UShort = 0u,
)

public data class Tuispicreatedialoginstanceparams(
    public var dwRequestID: UInt = 0u,
    public var hdDlgInst: Hdrvdialoginstance = null,
    public var htDlgInst: UInt = 0u,
    public var lpszUIDLLName: Pcwstr = null,
    public var lpParams: COpaquePointer? = null,
    public var dwSize: UInt = 0u,
)

public data class Varstring(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwStringSize: UInt = 0u,
    public var dwStringOffset: UInt = 0u,
)
