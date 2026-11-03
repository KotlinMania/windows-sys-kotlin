@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public data class ADDRALIAS(
    public var rgchName: ByteArray = ByteArray(41),
    public var rgchEName: ByteArray = ByteArray(11),
    public var rgchSrvr: ByteArray = ByteArray(12),
    public var dibDetail: UInt = 0u,
    public var type: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ADDRALIAS) return false
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

public data class DTR(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
)

public class LINEADDRESSCAPS(
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

public data class LINEADDRESSSTATUS(
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

public data class LINEAGENTACTIVITYENTRY(
    public var dwID: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
)

public data class LINEAGENTACTIVITYLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class LINEAGENTCAPS(
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
    public var ProxyGUID: GUID = GUID(),
)

public data class LINEAGENTENTRY(
    public var hAgent: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
    public var dwIDSize: UInt = 0u,
    public var dwIDOffset: UInt = 0u,
    public var dwPINSize: UInt = 0u,
    public var dwPINOffset: UInt = 0u,
)

public data class LINEAGENTGROUPENTRY(
    public var GroupID: LINEAGENTGROUPENTRY_0 = LINEAGENTGROUPENTRY_0(),
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
)

public data class LINEAGENTGROUPENTRY_0(
    public var dwGroupID1: UInt = 0u,
    public var dwGroupID2: UInt = 0u,
    public var dwGroupID3: UInt = 0u,
    public var dwGroupID4: UInt = 0u,
)

public data class LINEAGENTGROUPLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class LINEAGENTINFO(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
    public var cyOverallCallRate: System.Com.CY = System.Com.CY(),
    public var dwNumberOfACDCalls: UInt = 0u,
    public var dwNumberOfIncomingCalls: UInt = 0u,
    public var dwNumberOfOutgoingCalls: UInt = 0u,
    public var dwTotalACDTalkTime: UInt = 0u,
    public var dwTotalACDCallTime: UInt = 0u,
    public var dwTotalACDWrapUpTime: UInt = 0u,
)

public data class LINEAGENTLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class LINEAGENTSESSIONENTRY(
    public var hAgentSession: UInt = 0u,
    public var hAgent: UInt = 0u,
    public var GroupID: GUID = GUID(),
    public var dwWorkingAddressID: UInt = 0u,
)

public class LINEAGENTSESSIONINFO(
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
    public var cyACDCallRate: System.Com.CY = System.Com.CY(),
    public var dwLongestTimeToAnswer: UInt = 0u,
    public var dwAverageTimeToAnswer: UInt = 0u,
)

public data class LINEAGENTSESSIONLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class LINEAGENTSTATUS(
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

public data class LINEAPPINFO(
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

public class LINECALLINFO {
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

    public var DialParams: LINEDIALPARAMS = LINEDIALPARAMS()

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

public data class LINECALLLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwCallsNumEntries: UInt = 0u,
    public var dwCallsSize: UInt = 0u,
    public var dwCallsOffset: UInt = 0u,
)

public class LINECALLPARAMS(
    public var dwTotalSize: UInt = 0u,
    public var dwBearerMode: UInt = 0u,
    public var dwMinRate: UInt = 0u,
    public var dwMaxRate: UInt = 0u,
    public var dwMediaMode: UInt = 0u,
    public var dwCallParamFlags: UInt = 0u,
    public var dwAddressMode: UInt = 0u,
    public var dwAddressID: UInt = 0u,
    public var DialParams: LINEDIALPARAMS = LINEDIALPARAMS(),
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

public data class LINECALLSTATUS(
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
    public var tStateEntryTime: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
)

public data class LINECALLTREATMENTENTRY(
    public var dwCallTreatmentID: UInt = 0u,
    public var dwCallTreatmentNameSize: UInt = 0u,
    public var dwCallTreatmentNameOffset: UInt = 0u,
)

public data class LINECARDENTRY(
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

public data class LINECOUNTRYENTRY(
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

public data class LINECOUNTRYLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumCountries: UInt = 0u,
    public var dwCountryListSize: UInt = 0u,
    public var dwCountryListOffset: UInt = 0u,
)

public class LINEDEVCAPS(
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
    public var MinDialParams: LINEDIALPARAMS = LINEDIALPARAMS(),
    public var MaxDialParams: LINEDIALPARAMS = LINEDIALPARAMS(),
    public var DefaultDialParams: LINEDIALPARAMS = LINEDIALPARAMS(),
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
    public var PermanentLineGuid: GUID = GUID(),
)

public class LINEDEVSTATUS(
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

public data class LINEDIALPARAMS(
    public var dwDialPause: UInt = 0u,
    public var dwDialSpeed: UInt = 0u,
    public var dwDigitDuration: UInt = 0u,
    public var dwWaitForDialtone: UInt = 0u,
)

public data class LINEEXTENSIONID(
    public var dwExtensionID0: UInt = 0u,
    public var dwExtensionID1: UInt = 0u,
    public var dwExtensionID2: UInt = 0u,
    public var dwExtensionID3: UInt = 0u,
)

public data class LINEFORWARD(
    public var dwForwardMode: UInt = 0u,
    public var dwCallerAddressSize: UInt = 0u,
    public var dwCallerAddressOffset: UInt = 0u,
    public var dwDestCountryCode: UInt = 0u,
    public var dwDestAddressSize: UInt = 0u,
    public var dwDestAddressOffset: UInt = 0u,
)

public data class LINEFORWARDLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var ForwardList: List<LINEFORWARD> = List(1) { LINEFORWARD() },
)

public data class LINEGENERATETONE(
    public var dwFrequency: UInt = 0u,
    public var dwCadenceOn: UInt = 0u,
    public var dwCadenceOff: UInt = 0u,
    public var dwVolume: UInt = 0u,
)

public data class LINEINITIALIZEEXPARAMS(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var Handles: LINEINITIALIZEEXPARAMS_0 = LINEINITIALIZEEXPARAMS_0(),
    public var dwCompletionKey: UInt = 0u,
)

public data class LINEINITIALIZEEXPARAMS_0(public var hEvent: Foundation.HANDLE = Foundation.HANDLE(), public var hCompletionPort: Foundation.HANDLE = Foundation.HANDLE())

public class LINELOCATIONENTRY(
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

public data class LINEMEDIACONTROLCALLSTATE(public var dwCallStates: UInt = 0u, public var dwMediaControl: UInt = 0u)

public data class LINEMEDIACONTROLDIGIT(
    public var dwDigit: UInt = 0u,
    public var dwDigitModes: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class LINEMEDIACONTROLMEDIA(
    public var dwMediaModes: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class LINEMEDIACONTROLTONE(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
)

public data class LINEMESSAGE(
    public var hDevice: UInt = 0u,
    public var dwMessageID: UInt = 0u,
    public var dwCallbackInstance: ULong = 0uL,
    public var dwParam1: ULong = 0uL,
    public var dwParam2: ULong = 0uL,
    public var dwParam3: ULong = 0uL,
)

public data class LINEMONITORTONE(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
)

public data class LINEPROVIDERENTRY(
    public var dwPermanentProviderID: UInt = 0u,
    public var dwProviderFilenameSize: UInt = 0u,
    public var dwProviderFilenameOffset: UInt = 0u,
)

public data class LINEPROVIDERLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumProviders: UInt = 0u,
    public var dwProviderListSize: UInt = 0u,
    public var dwProviderListOffset: UInt = 0u,
)

public data class LINEPROXYREQUEST(
    public var dwSize: UInt = 0u,
    public var dwClientMachineNameSize: UInt = 0u,
    public var dwClientMachineNameOffset: UInt = 0u,
    public var dwClientUserNameSize: UInt = 0u,
    public var dwClientUserNameOffset: UInt = 0u,
    public var dwClientAppAPIVersion: UInt = 0u,
    public var dwRequestType: UInt = 0u,
    public var Anonymous: LINEPROXYREQUEST_0 = LINEPROXYREQUEST_0(),
)

public class LINEPROXYREQUEST_0(
    public var SetAgentGroup: LINEPROXYREQUEST_0_0 = LINEPROXYREQUEST_0_0(),
    public var SetAgentState: LINEPROXYREQUEST_0_1 = LINEPROXYREQUEST_0_1(),
    public var SetAgentActivity: LINEPROXYREQUEST_0_2 = LINEPROXYREQUEST_0_2(),
    public var GetAgentCaps: LINEPROXYREQUEST_0_3 = LINEPROXYREQUEST_0_3(),
    public var GetAgentStatus: LINEPROXYREQUEST_0_4 = LINEPROXYREQUEST_0_4(),
    public var AgentSpecific: LINEPROXYREQUEST_0_5 = LINEPROXYREQUEST_0_5(),
    public var GetAgentActivityList: LINEPROXYREQUEST_0_6 = LINEPROXYREQUEST_0_6(),
    public var GetAgentGroupList: LINEPROXYREQUEST_0_7 = LINEPROXYREQUEST_0_7(),
    public var CreateAgent: LINEPROXYREQUEST_0_8 = LINEPROXYREQUEST_0_8(),
    public var SetAgentStateEx: LINEPROXYREQUEST_0_9 = LINEPROXYREQUEST_0_9(),
    public var SetAgentMeasurementPeriod: LINEPROXYREQUEST_0_10 = LINEPROXYREQUEST_0_10(),
    public var GetAgentInfo: LINEPROXYREQUEST_0_11 = LINEPROXYREQUEST_0_11(),
    public var CreateAgentSession: LINEPROXYREQUEST_0_12 = LINEPROXYREQUEST_0_12(),
    public var GetAgentSessionList: LINEPROXYREQUEST_0_13 = LINEPROXYREQUEST_0_13(),
    public var GetAgentSessionInfo: LINEPROXYREQUEST_0_14 = LINEPROXYREQUEST_0_14(),
    public var SetAgentSessionState: LINEPROXYREQUEST_0_15 = LINEPROXYREQUEST_0_15(),
    public var GetQueueList: LINEPROXYREQUEST_0_16 = LINEPROXYREQUEST_0_16(),
    public var SetQueueMeasurementPeriod: LINEPROXYREQUEST_0_17 = LINEPROXYREQUEST_0_17(),
    public var GetQueueInfo: LINEPROXYREQUEST_0_18 = LINEPROXYREQUEST_0_18(),
    public var GetGroupList: LINEPROXYREQUEST_0_19 = LINEPROXYREQUEST_0_19(),
)

public data class LINEPROXYREQUEST_0_5(
    public var dwAddressID: UInt = 0u,
    public var dwAgentExtensionIDIndex: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var Params: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LINEPROXYREQUEST_0_5) return false
        if (this.dwAddressID != other.dwAddressID) return false
        if (this.dwAgentExtensionIDIndex != other.dwAgentExtensionIDIndex) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.Params.contentEquals(other.Params)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAddressID.hashCode()
        result = 31 * result + this.dwAgentExtensionIDIndex.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.Params.contentHashCode()
        return result
    }
}

public data class LINEPROXYREQUEST_0_12(
    public var hAgentSession: UInt = 0u,
    public var dwAgentPINSize: UInt = 0u,
    public var dwAgentPINOffset: UInt = 0u,
    public var hAgent: UInt = 0u,
    public var GroupID: GUID = GUID(),
    public var dwWorkingAddressID: UInt = 0u,
)

public data class LINEPROXYREQUEST_0_8(
    public var hAgent: UInt = 0u,
    public var dwAgentIDSize: UInt = 0u,
    public var dwAgentIDOffset: UInt = 0u,
    public var dwAgentPINSize: UInt = 0u,
    public var dwAgentPINOffset: UInt = 0u,
)

public data class LINEPROXYREQUEST_0_6(public var dwAddressID: UInt = 0u, public var ActivityList: LINEAGENTACTIVITYLIST = LINEAGENTACTIVITYLIST())

public data class LINEPROXYREQUEST_0_3(public var dwAddressID: UInt = 0u, public var AgentCaps: LINEAGENTCAPS = LINEAGENTCAPS())

public data class LINEPROXYREQUEST_0_7(public var dwAddressID: UInt = 0u, public var GroupList: LINEAGENTGROUPLIST = LINEAGENTGROUPLIST())

public data class LINEPROXYREQUEST_0_11(public var hAgent: UInt = 0u, public var AgentInfo: LINEAGENTINFO = LINEAGENTINFO())

public data class LINEPROXYREQUEST_0_14(public var hAgentSession: UInt = 0u, public var SessionInfo: LINEAGENTSESSIONINFO = LINEAGENTSESSIONINFO())

public data class LINEPROXYREQUEST_0_13(public var hAgent: UInt = 0u, public var SessionList: LINEAGENTSESSIONLIST = LINEAGENTSESSIONLIST())

public data class LINEPROXYREQUEST_0_4(public var dwAddressID: UInt = 0u, public var AgentStatus: LINEAGENTSTATUS = LINEAGENTSTATUS())

public data class LINEPROXYREQUEST_0_19(public var GroupList: LINEAGENTGROUPLIST = LINEAGENTGROUPLIST())

public data class LINEPROXYREQUEST_0_18(public var dwQueueID: UInt = 0u, public var QueueInfo: LINEQUEUEINFO = LINEQUEUEINFO())

public data class LINEPROXYREQUEST_0_16(public var GroupID: GUID = GUID(), public var QueueList: LINEQUEUELIST = LINEQUEUELIST())

public data class LINEPROXYREQUEST_0_2(public var dwAddressID: UInt = 0u, public var dwActivityID: UInt = 0u)

public data class LINEPROXYREQUEST_0_0(public var dwAddressID: UInt = 0u, public var GroupList: LINEAGENTGROUPLIST = LINEAGENTGROUPLIST())

public data class LINEPROXYREQUEST_0_10(public var hAgent: UInt = 0u, public var dwMeasurementPeriod: UInt = 0u)

public data class LINEPROXYREQUEST_0_15(
    public var hAgentSession: UInt = 0u,
    public var dwAgentSessionState: UInt = 0u,
    public var dwNextAgentSessionState: UInt = 0u,
)

public data class LINEPROXYREQUEST_0_9(
    public var hAgent: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
)

public data class LINEPROXYREQUEST_0_1(
    public var dwAddressID: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
)

public data class LINEPROXYREQUEST_0_17(public var dwQueueID: UInt = 0u, public var dwMeasurementPeriod: UInt = 0u)

public data class LINEPROXYREQUESTLIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class LINEQUEUEENTRY(
    public var dwQueueID: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
)

public data class LINEQUEUEINFO(
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

public data class LINEQUEUELIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
)

public data class LINEREQMAKECALL(
    public var szDestAddress: ByteArray = ByteArray(80),
    public var szAppName: ByteArray = ByteArray(40),
    public var szCalledParty: ByteArray = ByteArray(40),
    public var szComment: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LINEREQMAKECALL) return false
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

public data class LINEREQMAKECALLW(
    public var szDestAddress: UShortArray = UShortArray(80),
    public var szAppName: UShortArray = UShortArray(40),
    public var szCalledParty: UShortArray = UShortArray(40),
    public var szComment: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LINEREQMAKECALLW) return false
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

public data class LINEREQMEDIACALL(
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var wRequestID: Foundation.WPARAM = Foundation.WPARAM(),
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
        if (other !is LINEREQMEDIACALL) return false
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

public data class LINEREQMEDIACALLW(
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var wRequestID: Foundation.WPARAM = Foundation.WPARAM(),
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
        if (other !is LINEREQMEDIACALLW) return false
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

public data class LINETERMCAPS(
    public var dwTermDev: UInt = 0u,
    public var dwTermModes: UInt = 0u,
    public var dwTermSharing: UInt = 0u,
)

public data class LINETRANSLATECAPS(
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

public data class LINETRANSLATEOUTPUT(
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

public data class MSP_EVENT_INFO(
    public var dwSize: UInt = 0u,
    public var Event: MSP_EVENT = 0,
    public var hCall: Long = 0L,
    public var Anonymous: MSP_EVENT_INFO_0 = MSP_EVENT_INFO_0(),
)

public data class MSP_EVENT_INFO_0(
    public var MSP_ADDRESS_EVENT_INFO: MSP_EVENT_INFO_0_0 = MSP_EVENT_INFO_0_0(),
    public var MSP_CALL_EVENT_INFO: MSP_EVENT_INFO_0_1 = MSP_EVENT_INFO_0_1(),
    public var MSP_TSP_DATA: MSP_EVENT_INFO_0_2 = MSP_EVENT_INFO_0_2(),
    public var MSP_PRIVATE_EVENT_INFO: MSP_EVENT_INFO_0_3 = MSP_EVENT_INFO_0_3(),
    public var MSP_FILE_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_4 = MSP_EVENT_INFO_0_4(),
    public var MSP_ASR_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_5 = MSP_EVENT_INFO_0_5(),
    public var MSP_TTS_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_6 = MSP_EVENT_INFO_0_6(),
    public var MSP_TONE_TERMINAL_EVENT_INFO: MSP_EVENT_INFO_0_7 = MSP_EVENT_INFO_0_7(),
)

public data class MSP_EVENT_INFO_0_0(public var Type: MSP_ADDRESS_EVENT = 0, public var pTerminal: Long = 0L)

public data class MSP_EVENT_INFO_0_5(public var pASRTerminal: Long = 0L, public var hrErrorCode: HRESULT = 0)

public data class MSP_EVENT_INFO_0_1(
    public var Type: MSP_CALL_EVENT = 0,
    public var Cause: MSP_CALL_EVENT_CAUSE = 0,
    public var pStream: Long = 0L,
    public var pTerminal: Long = 0L,
    public var hrError: HRESULT = 0,
)

public data class MSP_EVENT_INFO_0_4(
    public var pParentFileTerminal: Long = 0L,
    public var pFileTrack: Long = 0L,
    public var TerminalMediaState: TERMINAL_MEDIA_STATE = 0,
    public var ftecEventCause: FT_STATE_EVENT_CAUSE = 0,
    public var hrErrorCode: HRESULT = 0,
)

public data class MSP_EVENT_INFO_0_3(public var pEvent: Long = 0L, public var lEventCode: Int = 0)

public data class MSP_EVENT_INFO_0_7(public var pToneTerminal: Long = 0L, public var hrErrorCode: HRESULT = 0)

public data class MSP_EVENT_INFO_0_2(public var dwBufferSize: UInt = 0u, public var pBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSP_EVENT_INFO_0_2) return false
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

public data class MSP_EVENT_INFO_0_6(public var pTTSTerminal: Long = 0L, public var hrErrorCode: HRESULT = 0)

public data class NSID(
    public var dwSize: UInt = 0u,
    public var uchType: UByteArray = UByteArray(16),
    public var xtype: UInt = 0u,
    public var lTime: Int = 0,
    public var address: NSID_0 = NSID_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NSID) return false
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

public data class NSID_0(public var alias: ADDRALIAS = ADDRALIAS(), public var rgchInterNet: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NSID_0) return false
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

public data class PHONEBUTTONINFO(
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

public class PHONECAPS(
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
    public var PermanentPhoneGuid: GUID = GUID(),
)

public data class PHONEEXTENSIONID(
    public var dwExtensionID0: UInt = 0u,
    public var dwExtensionID1: UInt = 0u,
    public var dwExtensionID2: UInt = 0u,
    public var dwExtensionID3: UInt = 0u,
)

public data class PHONEINITIALIZEEXPARAMS(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var Handles: PHONEINITIALIZEEXPARAMS_0 = PHONEINITIALIZEEXPARAMS_0(),
    public var dwCompletionKey: UInt = 0u,
)

public data class PHONEINITIALIZEEXPARAMS_0(public var hEvent: Foundation.HANDLE = Foundation.HANDLE(), public var hCompletionPort: Foundation.HANDLE = Foundation.HANDLE())

public data class PHONEMESSAGE(
    public var hDevice: UInt = 0u,
    public var dwMessageID: UInt = 0u,
    public var dwCallbackInstance: ULong = 0uL,
    public var dwParam1: ULong = 0uL,
    public var dwParam2: ULong = 0uL,
    public var dwParam3: ULong = 0uL,
)

public class PHONESTATUS(
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

public data class RENDDATA(
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

public data class STnefProblemArray(public var cProblem: UInt = 0u, public var aProblem: List<STnefProblem> = List(1) { STnefProblem() })

public data class TAPI_CUSTOMTONE(
    public var dwFrequency: UInt = 0u,
    public var dwCadenceOn: UInt = 0u,
    public var dwCadenceOff: UInt = 0u,
    public var dwVolume: UInt = 0u,
)

public data class TAPI_DETECTTONE(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
)

public data class TRP(
    public var trpid: UShort = 0u,
    public var cbgrtrp: UShort = 0u,
    public var cch: UShort = 0u,
    public var cbRgb: UShort = 0u,
)

public data class TUISPICREATEDIALOGINSTANCEPARAMS(
    public var dwRequestID: UInt = 0u,
    public var hdDlgInst: HDRVDIALOGINSTANCE = 0L,
    public var htDlgInst: UInt = 0u,
    public var lpszUIDLLName: PCWSTR = 0L,
    public var lpParams: Long = 0L,
    public var dwSize: UInt = 0u,
)

public data class VARSTRING(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwStringSize: UInt = 0u,
    public var dwStringOffset: UInt = 0u,
)
