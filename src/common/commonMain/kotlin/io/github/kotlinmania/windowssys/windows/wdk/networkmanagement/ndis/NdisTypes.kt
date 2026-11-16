package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public fun interface ClAddPartyCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClAddPartyCompleteHandler = ClAddPartyCompleteHandlerFn?

public fun interface ClCallConnectedHandlerFn {
    public operator fun invoke()
}

public typealias ClCallConnectedHandler = ClCallConnectedHandlerFn?

public fun interface ClCloseAfCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClCloseAfCompleteHandler = ClCloseAfCompleteHandlerFn?

public fun interface ClCloseCallCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClCloseCallCompleteHandler = ClCloseCallCompleteHandlerFn?

public fun interface ClDeregSapCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClDeregSapCompleteHandler = ClDeregSapCompleteHandlerFn?

public fun interface ClDropPartyCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClDropPartyCompleteHandler = ClDropPartyCompleteHandlerFn?

public fun interface ClIncomingCallHandlerFn {
    public operator fun invoke(): Int
}

public typealias ClIncomingCallHandler = ClIncomingCallHandlerFn?

public fun interface ClIncomingCallQosChangeHandlerFn {
    public operator fun invoke()
}

public typealias ClIncomingCallQosChangeHandler = ClIncomingCallQosChangeHandlerFn?

public fun interface ClIncomingCloseCallHandlerFn {
    public operator fun invoke()
}

public typealias ClIncomingCloseCallHandler = ClIncomingCloseCallHandlerFn?

public fun interface ClIncomingDropPartyHandlerFn {
    public operator fun invoke()
}

public typealias ClIncomingDropPartyHandler = ClIncomingDropPartyHandlerFn?

public fun interface ClMakeCallCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClMakeCallCompleteHandler = ClMakeCallCompleteHandlerFn?

public fun interface ClModifyCallQosCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClModifyCallQosCompleteHandler = ClModifyCallQosCompleteHandlerFn?

public fun interface ClOpenAfCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClOpenAfCompleteHandler = ClOpenAfCompleteHandlerFn?

public fun interface ClRegSapCompleteHandlerFn {
    public operator fun invoke()
}

public typealias ClRegSapCompleteHandler = ClRegSapCompleteHandlerFn?

public fun interface CmActivateVcCompleteHandlerFn {
    public operator fun invoke()
}

public typealias CmActivateVcCompleteHandler = CmActivateVcCompleteHandlerFn?

public fun interface CmAddPartyHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmAddPartyHandler = CmAddPartyHandlerFn?

public fun interface CmCloseAfHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmCloseAfHandler = CmCloseAfHandlerFn?

public fun interface CmCloseCallHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmCloseCallHandler = CmCloseCallHandlerFn?

public fun interface CmDeactivateVcCompleteHandlerFn {
    public operator fun invoke()
}

public typealias CmDeactivateVcCompleteHandler = CmDeactivateVcCompleteHandlerFn?

public fun interface CmDeregSapHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmDeregSapHandler = CmDeregSapHandlerFn?

public fun interface CmDropPartyHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmDropPartyHandler = CmDropPartyHandlerFn?

public fun interface CmIncomingCallCompleteHandlerFn {
    public operator fun invoke()
}

public typealias CmIncomingCallCompleteHandler = CmIncomingCallCompleteHandlerFn?

public fun interface CmMakeCallHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmMakeCallHandler = CmMakeCallHandlerFn?

public fun interface CmModifyCallQosHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmModifyCallQosHandler = CmModifyCallQosHandlerFn?

public fun interface CmOpenAfHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmOpenAfHandler = CmOpenAfHandlerFn?

public fun interface CmRegSapHandlerFn {
    public operator fun invoke(): Int
}

public typealias CmRegSapHandler = CmRegSapHandlerFn?

public fun interface CoAfRegisterNotifyHandlerFn {
    public operator fun invoke()
}

public typealias CoAfRegisterNotifyHandler = CoAfRegisterNotifyHandlerFn?

public typealias CoCallParameters = Long

public fun interface CoCreateVcHandlerFn {
    public operator fun invoke(): Int
}

public typealias CoCreateVcHandler = CoCreateVcHandlerFn?

public fun interface CoDeleteVcHandlerFn {
    public operator fun invoke(): Int
}

public typealias CoDeleteVcHandler = CoDeleteVcHandlerFn?

public typealias CoMediaParameters = Long

public typealias EthFilter = Long

public fun interface MiniportCoActivateVcFn {
    public operator fun invoke(miniportvccontext: ConstPtr, callparameters: MutPtr): Int
}

public typealias MiniportCoActivateVc = MiniportCoActivateVcFn?

public fun interface MiniportCoCreateVcFn {
    public operator fun invoke(miniportadaptercontext: ConstPtr, ndisvchandle: ConstPtr, miniportvccontext: MutPtr): Int
}

public typealias MiniportCoCreateVc = MiniportCoCreateVcFn?

public fun interface MiniportCoDeactivateVcFn {
    public operator fun invoke(miniportvccontext: ConstPtr): Int
}

public typealias MiniportCoDeactivateVc = MiniportCoDeactivateVcFn?

public fun interface MiniportCoDeleteVcFn {
    public operator fun invoke(miniportvccontext: ConstPtr): Int
}

public typealias MiniportCoDeleteVc = MiniportCoDeleteVcFn?

public typealias Ndis80211AuthenticationMode = Int

public typealias Ndis80211MediaStreamMode = Int

public typealias Ndis80211NetworkInfrastructure = Int

public typealias Ndis80211NetworkType = Int

public typealias Ndis80211PowerMode = Int

public typealias Ndis80211PrivacyFilter = Int

public typealias Ndis80211RadioStatus = Int

public typealias Ndis80211ReloadDefaults = Int

public typealias Ndis80211StatusType = Int

public typealias Ndis80211WepStatus = Int

public typealias Ndis8025RingState = Int

public typealias NdisAfList = Long

public typealias NdisCallManagerCharacteristics = Long

public typealias NdisClassId = Int

public typealias NdisDevicePnpEvent = Int

public typealias NdisDevicePowerState = Int

public typealias NdisEnvironmentType = Int

public typealias NdisFddiAttachmentType = Int

public typealias NdisFddiLconnectionState = Int

public typealias NdisFddiRingMgtState = Int

public typealias NdisHardwareStatus = Int

public typealias NdisInterfaceType = Int

public typealias NdisInterruptModeration = Int

public typealias NdisMediaState = Int

public typealias NdisMedium = Int

public typealias NdisMiniportBlock = Long

public typealias NdisMDriverBlock = Long

public typealias NdisNetworkChangeType = Int

public typealias NdisOpenBlock = Long

public typealias NdisParameterType = Int

public typealias NdisPdCounterHandle = MutPtr

public typealias NdisPdFilterHandle = MutPtr

public typealias NdisPdProviderHandle = MutPtr

public typealias NdisPerPacketInfo = Int

public typealias NdisPhysicalMedium = Int

public typealias NdisPollHandle = MutPtr

public typealias NdisPortAuthorizationState = Int

public typealias NdisPortControlState = Int

public typealias NdisPortType = Int

public typealias NdisPowerProfile = Int

public fun interface NdisProcFn {
    public operator fun invoke()
}

public typealias NdisProc = NdisProcFn?

public typealias NdisProcessorType = Int

public typealias NdisProcessorVendor = Int

public fun interface NdisProcCallbackFn {
    public operator fun invoke(workitem: ConstPtr, context: ConstPtr)
}

public typealias NdisProcCallback = NdisProcCallbackFn?

public typealias NdisProtocolBlock = Long

public typealias NdisRequestType = Int

public typealias NdisSupportedPauseFunctions = Int

public fun interface NdisTimerFunctionFn {
    public operator fun invoke(systemspecific1: ConstPtr, functioncontext: ConstPtr, systemspecific2: ConstPtr, systemspecific3: ConstPtr)
}

public typealias NdisTimerFunction = NdisTimerFunctionFn?

public typealias NdisWanHeaderFormat = Int

public typealias NdisWanMediumSubtype = Int

public typealias NdisWanQuality = Int

public typealias NdisWrapperHandle = Long

public typealias NullFilter = Long

public typealias OffloadConfAlgo = Int

public typealias OffloadIntegrityAlgo = Int

public typealias OffloadOperationE = Int

public fun interface PndisTimerFunctionFn {
    public operator fun invoke()
}

public typealias PndisTimerFunction = PndisTimerFunctionFn?

public fun interface ProtcolCoAfRegisterNotifyFn {
    public operator fun invoke()
}

public typealias ProtcolCoAfRegisterNotify = ProtcolCoAfRegisterNotifyFn?

public fun interface ProtocolClAddPartyCompleteFn {
    public operator fun invoke(status: Int, protocolpartycontext: ConstPtr, ndispartyhandle: ConstPtr, callparameters: ConstPtr)
}

public typealias ProtocolClAddPartyComplete = ProtocolClAddPartyCompleteFn?

public fun interface ProtocolClCallConnectedFn {
    public operator fun invoke(protocolvccontext: ConstPtr)
}

public typealias ProtocolClCallConnected = ProtocolClCallConnectedFn?

public fun interface ProtocolClCloseAfCompleteFn {
    public operator fun invoke(status: Int, protocolafcontext: ConstPtr)
}

public typealias ProtocolClCloseAfComplete = ProtocolClCloseAfCompleteFn?

public fun interface ProtocolClCloseCallCompleteFn {
    public operator fun invoke(status: Int, protocolvccontext: ConstPtr, protocolpartycontext: ConstPtr)
}

public typealias ProtocolClCloseCallComplete = ProtocolClCloseCallCompleteFn?

public fun interface ProtocolClDeregisterSapCompleteFn {
    public operator fun invoke(status: Int, protocolsapcontext: ConstPtr)
}

public typealias ProtocolClDeregisterSapComplete = ProtocolClDeregisterSapCompleteFn?

public fun interface ProtocolClDropPartyCompleteFn {
    public operator fun invoke(status: Int, protocolpartycontext: ConstPtr)
}

public typealias ProtocolClDropPartyComplete = ProtocolClDropPartyCompleteFn?

public fun interface ProtocolClIncomingCallFn {
    public operator fun invoke(protocolsapcontext: ConstPtr, protocolvccontext: ConstPtr, callparameters: MutPtr): Int
}

public typealias ProtocolClIncomingCall = ProtocolClIncomingCallFn?

public fun interface ProtocolClIncomingCallQosChangeFn {
    public operator fun invoke(protocolvccontext: ConstPtr, callparameters: ConstPtr)
}

public typealias ProtocolClIncomingCallQosChange = ProtocolClIncomingCallQosChangeFn?

public fun interface ProtocolClIncomingCloseCallFn {
    public operator fun invoke(closestatus: Int, protocolvccontext: ConstPtr, closedata: ConstPtr, size: UInt)
}

public typealias ProtocolClIncomingCloseCall = ProtocolClIncomingCloseCallFn?

public fun interface ProtocolClIncomingDropPartyFn {
    public operator fun invoke(dropstatus: Int, protocolpartycontext: ConstPtr, closedata: ConstPtr, size: UInt)
}

public typealias ProtocolClIncomingDropParty = ProtocolClIncomingDropPartyFn?

public fun interface ProtocolClMakeCallCompleteFn {
    public operator fun invoke(status: Int, protocolvccontext: ConstPtr, ndispartyhandle: ConstPtr, callparameters: ConstPtr)
}

public typealias ProtocolClMakeCallComplete = ProtocolClMakeCallCompleteFn?

public fun interface ProtocolClModifyCallQosCompleteFn {
    public operator fun invoke(status: Int, protocolvccontext: ConstPtr, callparameters: ConstPtr)
}

public typealias ProtocolClModifyCallQosComplete = ProtocolClModifyCallQosCompleteFn?

public fun interface ProtocolClOpenAfCompleteFn {
    public operator fun invoke(status: Int, protocolafcontext: ConstPtr, ndisafhandle: ConstPtr)
}

public typealias ProtocolClOpenAfComplete = ProtocolClOpenAfCompleteFn?

public fun interface ProtocolClRegisterSapCompleteFn {
    public operator fun invoke(status: Int, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: ConstPtr)
}

public typealias ProtocolClRegisterSapComplete = ProtocolClRegisterSapCompleteFn?

public fun interface ProtocolCmActivateVcCompleteFn {
    public operator fun invoke(status: Int, callmgrvccontext: ConstPtr, callparameters: ConstPtr)
}

public typealias ProtocolCmActivateVcComplete = ProtocolCmActivateVcCompleteFn?

public fun interface ProtocolCmAddPartyFn {
    public operator fun invoke(callmgrvccontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: MutPtr): Int
}

public typealias ProtocolCmAddParty = ProtocolCmAddPartyFn?

public fun interface ProtocolCmCloseAfFn {
    public operator fun invoke(callmgrafcontext: ConstPtr): Int
}

public typealias ProtocolCmCloseAf = ProtocolCmCloseAfFn?

public fun interface ProtocolCmCloseCallFn {
    public operator fun invoke(callmgrvccontext: ConstPtr, callmgrpartycontext: ConstPtr, closedata: ConstPtr, size: UInt): Int
}

public typealias ProtocolCmCloseCall = ProtocolCmCloseCallFn?

public fun interface ProtocolCmDeactivateVcCompleteFn {
    public operator fun invoke(status: Int, callmgrvccontext: ConstPtr)
}

public typealias ProtocolCmDeactivateVcComplete = ProtocolCmDeactivateVcCompleteFn?

public fun interface ProtocolCmDeregisterSapFn {
    public operator fun invoke(callmgrsapcontext: ConstPtr): Int
}

public typealias ProtocolCmDeregisterSap = ProtocolCmDeregisterSapFn?

public fun interface ProtocolCmDropPartyFn {
    public operator fun invoke(callmgrpartycontext: ConstPtr, closedata: ConstPtr, size: UInt): Int
}

public typealias ProtocolCmDropParty = ProtocolCmDropPartyFn?

public fun interface ProtocolCmIncomingCallCompleteFn {
    public operator fun invoke(status: Int, callmgrvccontext: ConstPtr, callparameters: ConstPtr)
}

public typealias ProtocolCmIncomingCallComplete = ProtocolCmIncomingCallCompleteFn?

public fun interface ProtocolCmMakeCallFn {
    public operator fun invoke(callmgrvccontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: MutPtr): Int
}

public typealias ProtocolCmMakeCall = ProtocolCmMakeCallFn?

public fun interface ProtocolCmModifyQosCallFn {
    public operator fun invoke(callmgrvccontext: ConstPtr, callparameters: ConstPtr): Int
}

public typealias ProtocolCmModifyQosCall = ProtocolCmModifyQosCallFn?

public fun interface ProtocolCmOpenAfFn {
    public operator fun invoke(callmgrbindingcontext: ConstPtr, addressfamily: ConstPtr, ndisafhandle: ConstPtr, callmgrafcontext: MutPtr): Int
}

public typealias ProtocolCmOpenAf = ProtocolCmOpenAfFn?

public fun interface ProtocolCmRegSapFn {
    public operator fun invoke(callmgrafcontext: ConstPtr, sap: ConstPtr, ndissaphandle: ConstPtr, callmgrsapcontext: MutPtr): Int
}

public typealias ProtocolCmRegSap = ProtocolCmRegSapFn?

public fun interface ProtocolCoAfRegisterNotifyFn {
    public operator fun invoke(protocolbindingcontext: ConstPtr, addressfamily: ConstPtr)
}

public typealias ProtocolCoAfRegisterNotify = ProtocolCoAfRegisterNotifyFn?

public fun interface ProtocolCoCreateVcFn {
    public operator fun invoke(protocolafcontext: ConstPtr, ndisvchandle: ConstPtr, protocolvccontext: MutPtr): Int
}

public typealias ProtocolCoCreateVc = ProtocolCoCreateVcFn?

public fun interface ProtocolCoDeleteVcFn {
    public operator fun invoke(protocolvccontext: ConstPtr): Int
}

public typealias ProtocolCoDeleteVc = ProtocolCoDeleteVcFn?

public fun interface TdiPnpHandlerFn {
    public operator fun invoke(uppercomponent: ConstPtr, lowercomponent: ConstPtr, bindlist: ConstPtr, reconfigbuffer: ConstPtr, reconfigbuffersize: UInt, operation: UInt): Ntstatus
}

public typealias TdiPnpHandler = TdiPnpHandlerFn?

public fun interface TdiRegisterCallbackFn {
    public operator fun invoke(devicename: ConstPtr, tdihandle: MutPtr): Ntstatus
}

public typealias TdiRegisterCallback = TdiRegisterCallbackFn?

public typealias TrFilter = Long

public typealias UdpEncapType = Int

public fun interface WCoActivateVcHandlerFn {
    public operator fun invoke(): Int
}

public typealias WCoActivateVcHandler = WCoActivateVcHandlerFn?

public fun interface WCoCreateVcHandlerFn {
    public operator fun invoke(): Int
}

public typealias WCoCreateVcHandler = WCoCreateVcHandlerFn?

public fun interface WCoDeactivateVcHandlerFn {
    public operator fun invoke(): Int
}

public typealias WCoDeactivateVcHandler = WCoDeactivateVcHandlerFn?

public fun interface WCoDeleteVcHandlerFn {
    public operator fun invoke(): Int
}

public typealias WCoDeleteVcHandler = WCoDeleteVcHandlerFn?
