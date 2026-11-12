package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.WtssessionNotification

public typealias ChDescriptionType = Int

public typealias DevpropPcideviceAcscompatibleuphierarchy = UInt

public typealias DevpropPcideviceAcssupport = UInt

public typealias DevpropPcideviceCurrentspeedandmode = UInt

public typealias DevpropPcideviceDevicebridgetype = UInt

public typealias DevpropPcideviceInterrupttype = UInt

public typealias DevpropPcideviceSriovsupport = UInt

public typealias DevpropPciexpressdeviceLinkspeed = UInt

public typealias DevpropPciexpressdeviceLinkwidth = UInt

public typealias DevpropPciexpressdevicePayloadorrequestsize = UInt

public typealias DevpropPciexpressdeviceSpecVersion = UInt

public typealias DevpropPcirootbusBuswidth = UInt

public typealias DevpropPcirootbusCurrentspeedandmode = UInt

public typealias DevpropPcirootbusSecondaryinterface = UInt

public typealias DevpropPcirootbusSupportedspeedsandmodes = UInt

public fun interface Dot11extihvAdapterResetFn {
    public operator fun invoke(hihvextadapter: Handle): UInt
}

public typealias Dot11extihvAdapterReset = Dot11extihvAdapterResetFn?

public fun interface Dot11extihvControlFn {
    public operator fun invoke(hihvextadapter: Handle, dwinbuffersize: UInt, pinbuffer: ConstPtr<UByte>, dwoutbuffersize: UInt, poutbuffer: MutPtr<UByte>, pdwbytesreturned: MutPtr<UInt>): UInt
}

public typealias Dot11extihvControl = Dot11extihvControlFn?

public fun interface Dot11extihvCreateDiscoveryProfilesFn {
    public operator fun invoke(hihvextadapter: Handle, binsecure: Bool, pihvprofileparams: ConstPtr<Dot11extIhvProfileParams>, pconnectablebssid: ConstPtr<Dot11BssList>, pihvdiscoveryprofilelist: MutPtr<Dot11extIhvDiscoveryProfileList>, pdwreasoncode: MutPtr<UInt>): UInt
}

public typealias Dot11extihvCreateDiscoveryProfiles = Dot11extihvCreateDiscoveryProfilesFn?

public fun interface Dot11extihvDeinitAdapterFn {
    public operator fun invoke(hihvextadapter: Handle)
}

public typealias Dot11extihvDeinitAdapter = Dot11extihvDeinitAdapterFn?

public fun interface Dot11extihvDeinitServiceFn {
    public operator fun invoke()
}

public typealias Dot11extihvDeinitService = Dot11extihvDeinitServiceFn?

public fun interface Dot11extihvGetVersionInfoFn {
    public operator fun invoke(pdot11ihvversioninfo: MutPtr<Dot11IhvVersionInfo>): UInt
}

public typealias Dot11extihvGetVersionInfo = Dot11extihvGetVersionInfoFn?

public fun interface Dot11extihvInitAdapterFn {
    public operator fun invoke(pdot11adapter: ConstPtr<Dot11Adapter>, hdot11svchandle: Handle, phihvextadapter: MutPtr<Handle>): UInt
}

public typealias Dot11extihvInitAdapter = Dot11extihvInitAdapterFn?

public fun interface Dot11extihvInitServiceFn {
    public operator fun invoke(dwvernumused: UInt, pdot11extapi: ConstPtr<Dot11extApis>, pvreserved: ConstPtr<CVoid>, pdot11ihvhandlers: MutPtr<Dot11extIhvHandlers>): UInt
}

public typealias Dot11extihvInitService = Dot11extihvInitServiceFn?

public fun interface Dot11extihvInitVirtualStationFn {
    public operator fun invoke(pdot11extvsapi: ConstPtr<Dot11extVirtualStationApis>, pvreserved: ConstPtr<CVoid>): UInt
}

public typealias Dot11extihvInitVirtualStation = Dot11extihvInitVirtualStationFn?

public fun interface Dot11extihvIsUiRequestPendingFn {
    public operator fun invoke(guiduirequest: Guid, pbisrequestpending: MutPtr<Bool>): UInt
}

public typealias Dot11extihvIsUiRequestPending = Dot11extihvIsUiRequestPendingFn?

public fun interface Dot11extihvOnexIndicateResultFn {
    public operator fun invoke(hihvextadapter: Handle, msonexresult: Dot11MsonexResult, pdot11msonexresultparams: ConstPtr<Dot11MsonexResultParams>): UInt
}

public typealias Dot11extihvOnexIndicateResult = Dot11extihvOnexIndicateResultFn?

public fun interface Dot11extihvPerformCapabilityMatchFn {
    public operator fun invoke(hihvextadapter: Handle, pihvprofileparams: ConstPtr<Dot11extIhvProfileParams>, pihvconnprofile: ConstPtr<Dot11extIhvConnectivityProfile>, pihvsecprofile: ConstPtr<Dot11extIhvSecurityProfile>, pconnectablebssid: ConstPtr<Dot11BssList>, pdwreasoncode: MutPtr<UInt>): UInt
}

public typealias Dot11extihvPerformCapabilityMatch = Dot11extihvPerformCapabilityMatchFn?

public fun interface Dot11extihvPerformPostAssociateFn {
    public operator fun invoke(hihvextadapter: Handle, hsecuritysessionid: Handle, pportstate: ConstPtr<Dot11PortState>, udot11assocparamsbytes: UInt, pdot11assocparams: ConstPtr<Dot11AssociationCompletionParameters>): UInt
}

public typealias Dot11extihvPerformPostAssociate = Dot11extihvPerformPostAssociateFn?

public fun interface Dot11extihvPerformPreAssociateFn {
    public operator fun invoke(hihvextadapter: Handle, hconnectsession: Handle, pihvprofileparams: ConstPtr<Dot11extIhvProfileParams>, pihvconnprofile: ConstPtr<Dot11extIhvConnectivityProfile>, pihvsecprofile: ConstPtr<Dot11extIhvSecurityProfile>, pconnectablebssid: ConstPtr<Dot11BssList>, pdwreasoncode: MutPtr<UInt>): UInt
}

public typealias Dot11extihvPerformPreAssociate = Dot11extihvPerformPreAssociateFn?

public fun interface Dot11extihvProcessSessionChangeFn {
    public operator fun invoke(ueventtype: UInt, psessionnotification: ConstPtr<WtssessionNotification>): UInt
}

public typealias Dot11extihvProcessSessionChange = Dot11extihvProcessSessionChangeFn?

public fun interface Dot11extihvProcessUiResponseFn {
    public operator fun invoke(guiduirequest: Guid, dwbytecount: UInt, pvresponsebuffer: ConstPtr<CVoid>): UInt
}

public typealias Dot11extihvProcessUiResponse = Dot11extihvProcessUiResponseFn?

public fun interface Dot11extihvQueryUiRequestFn {
    public operator fun invoke(hihvextadapter: Handle, connectionphase: Dot11extIhvConnectionPhase, ppihvuirequest: MutPtr<MutPtr<Dot11extIhvUiRequest>>): UInt
}

public typealias Dot11extihvQueryUiRequest = Dot11extihvQueryUiRequestFn?

public fun interface Dot11extihvReceiveIndicationFn {
    public operator fun invoke(hihvextadapter: Handle, indicationtype: Dot11extIhvIndicationType, ubufferlength: UInt, pvbuffer: ConstPtr<CVoid>): UInt
}

public typealias Dot11extihvReceiveIndication = Dot11extihvReceiveIndicationFn?

public fun interface Dot11extihvReceivePacketFn {
    public operator fun invoke(hihvextadapter: Handle, dwinbuffersize: UInt, pvinbuffer: ConstPtr<CVoid>): UInt
}

public typealias Dot11extihvReceivePacket = Dot11extihvReceivePacketFn?

public fun interface Dot11extihvSendPacketCompletionFn {
    public operator fun invoke(hsendcompletion: Handle): UInt
}

public typealias Dot11extihvSendPacketCompletion = Dot11extihvSendPacketCompletionFn?

public fun interface Dot11extihvStopPostAssociateFn {
    public operator fun invoke(hihvextadapter: Handle, ppeer: ConstPtr<ConstPtr<UByte>>, dot11assocstatus: UInt): UInt
}

public typealias Dot11extihvStopPostAssociate = Dot11extihvStopPostAssociateFn?

public fun interface Dot11extihvValidateProfileFn {
    public operator fun invoke(hihvextadapter: Handle, pihvprofileparams: ConstPtr<Dot11extIhvProfileParams>, pihvconnprofile: ConstPtr<Dot11extIhvConnectivityProfile>, pihvsecprofile: ConstPtr<Dot11extIhvSecurityProfile>, pdwreasoncode: MutPtr<UInt>): UInt
}

public typealias Dot11extihvValidateProfile = Dot11extihvValidateProfileFn?

public fun interface Dot11extAllocateBufferFn {
    public operator fun invoke(dwbytecount: UInt, ppvbuffer: MutPtr<MutPtr<CVoid>>): UInt
}

public typealias Dot11extAllocateBuffer = Dot11extAllocateBufferFn?

public fun interface Dot11extFreeBufferFn {
    public operator fun invoke(pvmemory: ConstPtr<CVoid>)
}

public typealias Dot11extFreeBuffer = Dot11extFreeBufferFn?

public fun interface Dot11extGetProfileCustomUserDataFn {
    public operator fun invoke(hdot11svchandle: Handle, hconnectsession: Handle, dwsessionid: UInt, pdwdatasize: MutPtr<UInt>, ppvdata: MutPtr<MutPtr<CVoid>>): UInt
}

public typealias Dot11extGetProfileCustomUserData = Dot11extGetProfileCustomUserDataFn?

public typealias Dot11extIhvConnectionPhase = Int

public typealias Dot11extIhvIndicationType = Int

public fun interface Dot11extNicSpecificExtensionFn {
    public operator fun invoke(hdot11svchandle: Handle, dwinbuffersize: UInt, pvinbuffer: ConstPtr<CVoid>, pdwoutbuffersize: MutPtr<UInt>, pvoutbuffer: MutPtr<CVoid>): UInt
}

public typealias Dot11extNicSpecificExtension = Dot11extNicSpecificExtensionFn?

public fun interface Dot11extOnexStartFn {
    public operator fun invoke(hdot11svchandle: Handle, peapattributes: ConstPtr<EapAttributes>): UInt
}

public typealias Dot11extOnexStart = Dot11extOnexStartFn?

public fun interface Dot11extOnexStopFn {
    public operator fun invoke(hdot11svchandle: Handle): UInt
}

public typealias Dot11extOnexStop = Dot11extOnexStopFn?

public fun interface Dot11extPostAssociateCompletionFn {
    public operator fun invoke(hdot11svchandle: Handle, hsecuritysessionid: Handle, ppeer: ConstPtr<ConstPtr<UByte>>, dwreasoncode: UInt, dwwin32error: UInt): UInt
}

public typealias Dot11extPostAssociateCompletion = Dot11extPostAssociateCompletionFn?

public fun interface Dot11extPreAssociateCompletionFn {
    public operator fun invoke(hdot11svchandle: Handle, hconnectsession: Handle, dwreasoncode: UInt, dwwin32error: UInt): UInt
}

public typealias Dot11extPreAssociateCompletion = Dot11extPreAssociateCompletionFn?

public fun interface Dot11extProcessOnexPacketFn {
    public operator fun invoke(hdot11svchandle: Handle, dwinpacketsize: UInt, pvinpacket: ConstPtr<CVoid>): UInt
}

public typealias Dot11extProcessOnexPacket = Dot11extProcessOnexPacketFn?

public fun interface Dot11extQueryVirtualStationPropertiesFn {
    public operator fun invoke(hdot11svchandle: Handle, pbisvirtualstation: MutPtr<Bool>, pgprimary: MutPtr<Guid>, pvreserved: ConstPtr<CVoid>): UInt
}

public typealias Dot11extQueryVirtualStationProperties = Dot11extQueryVirtualStationPropertiesFn?

public fun interface Dot11extReleaseVirtualStationFn {
    public operator fun invoke(hdot11primaryhandle: Handle, pvreserved: ConstPtr<CVoid>): UInt
}

public typealias Dot11extReleaseVirtualStation = Dot11extReleaseVirtualStationFn?

public fun interface Dot11extRequestVirtualStationFn {
    public operator fun invoke(hdot11primaryhandle: Handle, pvreserved: ConstPtr<CVoid>): UInt
}

public typealias Dot11extRequestVirtualStation = Dot11extRequestVirtualStationFn?

public fun interface Dot11extSendNotificationFn {
    public operator fun invoke(hdot11svchandle: Handle, pnotificationdata: ConstPtr<L2NotificationData>): UInt
}

public typealias Dot11extSendNotification = Dot11extSendNotificationFn?

public fun interface Dot11extSendPacketFn {
    public operator fun invoke(hdot11svchandle: Handle, upacketlen: UInt, pvpacket: ConstPtr<CVoid>, hsendcompletion: Handle): UInt
}

public typealias Dot11extSendPacket = Dot11extSendPacketFn?

public fun interface Dot11extSendUiRequestFn {
    public operator fun invoke(hdot11svchandle: Handle, pihvuirequest: ConstPtr<Dot11extIhvUiRequest>): UInt
}

public typealias Dot11extSendUiRequest = Dot11extSendUiRequestFn?

public fun interface Dot11extSetAuthAlgorithmFn {
    public operator fun invoke(hdot11svchandle: Handle, dwauthalgo: UInt): UInt
}

public typealias Dot11extSetAuthAlgorithm = Dot11extSetAuthAlgorithmFn?

public fun interface Dot11extSetCurrentProfileFn {
    public operator fun invoke(hdot11svchandle: Handle, hconnectsession: Handle, pihvconnprofile: ConstPtr<Dot11extIhvConnectivityProfile>, pihvsecprofile: ConstPtr<Dot11extIhvSecurityProfile>): UInt
}

public typealias Dot11extSetCurrentProfile = Dot11extSetCurrentProfileFn?

public fun interface Dot11extSetDefaultKeyFn {
    public operator fun invoke(hdot11svchandle: Handle, pkey: ConstPtr<Dot11CipherDefaultKeyValue>, dot11direction: Dot11Direction): UInt
}

public typealias Dot11extSetDefaultKey = Dot11extSetDefaultKeyFn?

public fun interface Dot11extSetDefaultKeyIdFn {
    public operator fun invoke(hdot11svchandle: Handle, udefaultkeyid: UInt): UInt
}

public typealias Dot11extSetDefaultKeyId = Dot11extSetDefaultKeyIdFn?

public fun interface Dot11extSetEthertypeHandlingFn {
    public operator fun invoke(hdot11svchandle: Handle, umaxbacklog: UInt, unumofexemption: UInt, pexemption: ConstPtr<Dot11PrivacyExemption>, unumofregistration: UInt, pusregistration: ConstPtr<UShort>): UInt
}

public typealias Dot11extSetEthertypeHandling = Dot11extSetEthertypeHandlingFn?

public fun interface Dot11extSetExcludeUnencryptedFn {
    public operator fun invoke(hdot11svchandle: Handle, bexcludeunencrypted: Bool): UInt
}

public typealias Dot11extSetExcludeUnencrypted = Dot11extSetExcludeUnencryptedFn?

public fun interface Dot11extSetKeyMappingKeyFn {
    public operator fun invoke(hdot11svchandle: Handle, pkey: ConstPtr<Dot11CipherKeyMappingKeyValue>): UInt
}

public typealias Dot11extSetKeyMappingKey = Dot11extSetKeyMappingKeyFn?

public fun interface Dot11extSetMulticastCipherAlgorithmFn {
    public operator fun invoke(hdot11svchandle: Handle, dwmulticastcipheralgo: UInt): UInt
}

public typealias Dot11extSetMulticastCipherAlgorithm = Dot11extSetMulticastCipherAlgorithmFn?

public fun interface Dot11extSetProfileCustomUserDataFn {
    public operator fun invoke(hdot11svchandle: Handle, hconnectsession: Handle, dwsessionid: UInt, dwdatasize: UInt, pvdata: ConstPtr<CVoid>): UInt
}

public typealias Dot11extSetProfileCustomUserData = Dot11extSetProfileCustomUserDataFn?

public fun interface Dot11extSetUnicastCipherAlgorithmFn {
    public operator fun invoke(hdot11svchandle: Handle, dwunicastcipheralgo: UInt): UInt
}

public typealias Dot11extSetUnicastCipherAlgorithm = Dot11extSetUnicastCipherAlgorithmFn?

public fun interface Dot11extSetVirtualStationApPropertiesFn {
    public operator fun invoke(hdot11svchandle: Handle, hconnectsession: Handle, dwnumproperties: UInt, pproperties: ConstPtr<Dot11extVirtualStationApProperty>, pvreserved: ConstPtr<CVoid>): UInt
}

public typealias Dot11extSetVirtualStationApProperties = Dot11extSetVirtualStationApPropertiesFn?

public typealias Dot11AcParam = Int

public typealias Dot11AdhocAuthAlgorithm = Int

public typealias Dot11AdhocCipherAlgorithm = Int

public typealias Dot11AdhocConnectFailReason = Int

public typealias Dot11AdhocNetworkConnectionStatus = Int

public typealias Dot11AnqpQueryResult = Int

public typealias Dot11AssociationState = Int

public typealias Dot11AuthAlgorithm = Int

public typealias Dot11Band = Int

public typealias Dot11BssType = Int

public typealias Dot11CipherAlgorithm = Int

public typealias Dot11Direction = Int

public typealias Dot11DiversitySupport = Int

public typealias Dot11DsInfo = Int

public typealias Dot11HopAlgoAdopted = Int

public typealias Dot11KeyDirection = Int

public typealias Dot11ManufacturingCallbackType = Int

public typealias Dot11ManufacturingSelfTestType = Int

public typealias Dot11ManufacturingTestType = Int

public typealias Dot11MsonexResult = Int

public typealias Dot11OffloadType = Int

public typealias Dot11PhyType = Int

public typealias Dot11PowerMode = Int

public typealias Dot11PowerModeReason = Int

public typealias Dot11RadioState = Int

public typealias Dot11ResetType = Int

public typealias Dot11ScanType = Int

public typealias Dot11TempType = Int

public typealias Dot11UpdateIeOp = Int

public typealias Dot11WfdDiscoverType = Int

public typealias Dot11WfdScanType = Int

public typealias Dot11WpsConfigMethod = Int

public typealias Dot11WpsDevicePasswordId = Int

public typealias OnexAuthIdentity = Int

public typealias OnexAuthRestartReason = Int

public typealias OnexAuthStatus = Int

public typealias OnexEapMethodBackendSupport = Int

public typealias OnexNotificationType = Int

public typealias OnexReasonCode = Int

public fun interface WfdOpenSessionCompleteCallbackFn {
    public operator fun invoke(hsessionhandle: Handle, pvcontext: ConstPtr<CVoid>, guidsessioninterface: Guid, dwerror: UInt, dwreasoncode: UInt)
}

public typealias WfdOpenSessionCompleteCallback = WfdOpenSessionCompleteCallbackFn?

public typealias WfdRoleType = Int

public typealias WlanAdhocNetworkState = Int

public typealias WlanAutoconfOpcode = Int

public typealias WlanConnectionMode = Int

public typealias WlanConnectionNotificationFlags = UInt

public typealias WlanFilterListType = Int

public typealias WlanHostedNetworkNotificationCode = Int

public typealias WlanHostedNetworkOpcode = Int

public typealias WlanHostedNetworkPeerAuthState = Int

public typealias WlanHostedNetworkReason = Int

public typealias WlanHostedNetworkState = Int

public typealias WlanIhvControlType = Int

public typealias WlanInterfaceState = Int

public typealias WlanInterfaceType = Int

public typealias WlanIntfOpcode = Int

public typealias WlanNotificationAcm = Int

public fun interface WlanNotificationCallbackFn {
    public operator fun invoke(param0: MutPtr<L2NotificationData>, param1: MutPtr<CVoid>)
}

public typealias WlanNotificationCallback = WlanNotificationCallbackFn?

public typealias WlanNotificationMsm = Int

public typealias WlanNotificationSecurity = Int

public typealias WlanNotificationSources = UInt

public typealias WlanOpcodeValueType = Int

public typealias WlanOperationalState = Int

public typealias WlanPowerSetting = Int

public typealias WlanSecurableObject = Int

public typealias WlanSetEaphostFlags = UInt

public typealias WlDisplayPages = Int
