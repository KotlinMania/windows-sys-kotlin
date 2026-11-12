@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMSleep
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisMapFile
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry
import io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ndisAcquireReadWriteLock(lock: MutPtr, fwrite: Boolean, lockstate: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock.rawAddress.toCPointer<ByteVar>(), fwrite, lockstate.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr, length: UInt, tag: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress.rawAddress.toCPointer<ByteVar>(), length, tag)

public actual fun ndisCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer.rawAddress.toCPointer<ByteVar>(), timercancelled.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisClAddParty(ndisvchandle: ConstPtr, protocolpartycontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle.rawAddress.toCPointer<ByteVar>(), protocolpartycontext.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>(), ndispartyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle.rawAddress.toCPointer<ByteVar>(), ndispartyhandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), size)

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), size)

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr): Int =
    0

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status, ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr, callparameters: MutPtr, protocolpartycontext: ConstPtr, ndispartyhandle: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>(), protocolpartycontext.rawAddress.toCPointer<ByteVar>(), ndispartyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle.rawAddress.toCPointer<ByteVar>(), protocolsapcontext.rawAddress.toCPointer<ByteVar>(), sap.rawAddress.toCPointer<ByteVar>(), ndissaphandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCloseFile(filehandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr, callparameters: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status, ndispartyhandle.rawAddress.toCPointer<ByteVar>(), callmgrpartycontext.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status, ndisafhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status, ndisvchandle.rawAddress.toCPointer<ByteVar>(), ndispartyhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status, ndissaphandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr, ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle.rawAddress.toCPointer<ByteVar>(), ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status, ndispartyhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status, ndisvchandle.rawAddress.toCPointer<ByteVar>(), ndispartyhandle.rawAddress.toCPointer<ByteVar>(), callmgrpartycontext.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status, ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr, callmgrafcontext: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status, ndisafhandle.rawAddress.toCPointer<ByteVar>(), callmgrafcontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr, callmgrsapcontext: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status, ndissaphandle.rawAddress.toCPointer<ByteVar>(), callmgrsapcontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr, baseinstancename: ConstPtr, vcinstancename: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle.rawAddress.toCPointer<ByteVar>(), baseinstancename.rawAddress.toCPointer<ByteVar>(), vcinstancename.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr, ndisafhandle: ConstPtr, protocolvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle.rawAddress.toCPointer<ByteVar>(), ndisafhandle.rawAddress.toCPointer<ByteVar>(), protocolvccontext.rawAddress.toCPointer<ByteVar>(), ndisvchandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr, tapicallid: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle.rawAddress.toCPointer<ByteVar>(), tapicallid.rawAddress.toCPointer<ByteVar>())

public actual fun ndisCompleteDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status.rawAddress.toCPointer<ByteVar>(), ndisdmahandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), offset, length, writetodevice)
}

public actual fun ndisCopyBuffer(status: MutPtr, buffer: MutPtr, poolhandle: ConstPtr, memorydescriptor: ConstPtr, offset: UInt, length: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(status.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), poolhandle.rawAddress.toCPointer<ByteVar>(), memorydescriptor.rawAddress.toCPointer<ByteVar>(), offset, length)
}

public actual fun ndisDeregisterTdiCallBack() {
    windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()
}

public actual fun ndisFreeMemory(virtualaddress: ConstPtr, length: UInt, memoryflags: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress.rawAddress.toCPointer<ByteVar>(), length, memoryflags)
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr, pkernelanduser: MutPtr, pindex: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount.rawAddress.toCPointer<ByteVar>(), pkernelanduser.rawAddress.toCPointer<ByteVar>(), pindex.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ndisGetSharedDataAlignment(): UInt =
    windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment()

public actual fun ndisGetVersion(): UInt =
    windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion()

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr, protocolhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle.rawAddress.toCPointer<ByteVar>(), protocolhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr, deviceinstance: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle.rawAddress.toCPointer<ByteVar>(), deviceinstance.rawAddress.toCPointer<ByteVar>())

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr, driverinstance: ConstPtr, devicecontext: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle.rawAddress.toCPointer<ByteVar>(), driverinstance.rawAddress.toCPointer<ByteVar>(), devicecontext.rawAddress.toCPointer<ByteVar>())

public actual fun ndisInitializeEvent(event: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisInitializeReadWriteLock(lock: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisInitializeString(destination: MutPtr, source: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisInitializeTimer(timer: MutPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), functioncontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: MutPtr, physicaladdress: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), length, cached, virtualaddress.rawAddress.toCPointer<ByteVar>(), physicaladdress.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, context: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), length, cached, context.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer.rawAddress.toCPointer<ByteVar>(), timercancelled.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMCloseLog(loghandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr, ndisafhandle: ConstPtr, miniportvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), ndisafhandle.rawAddress.toCPointer<ByteVar>(), miniportvccontext.rawAddress.toCPointer<ByteVar>(), ndisvchandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr, addressfamily: MutPtr, cmcharacteristics: MutPtr, sizeofcmcharacteristics: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), addressfamily.rawAddress.toCPointer<ByteVar>(), cmcharacteristics.rawAddress.toCPointer<ByteVar>(), sizeofcmcharacteristics)

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status, ndisvchandle.rawAddress.toCPointer<ByteVar>(), callparameters.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status, ndisvchandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr, size: UInt, loghandle: MutPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), size, loghandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt, portoffset: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), initialport, numberofports, portoffset.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMFlushLog(loghandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: ConstPtr, physicaladdress: Long) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), length, cached, virtualaddress.rawAddress.toCPointer<ByteVar>(), physicaladdress)
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr, physicaldeviceobject: MutPtr, functionaldeviceobject: MutPtr, nextdeviceobject: MutPtr, allocatedresources: MutPtr, allocatedresourcestranslated: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), physicaldeviceobject.rawAddress.toCPointer<ByteVar>(), functionaldeviceobject.rawAddress.toCPointer<ByteVar>(), nextdeviceobject.rawAddress.toCPointer<ByteVar>(), allocatedresources.rawAddress.toCPointer<ByteVar>(), allocatedresourcestranslated.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr): UInt =
    windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMInitializeTimer(timer: ConstPtr, miniportadapterhandle: ConstPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer.rawAddress.toCPointer<ByteVar>(), miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), functioncontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr, miniportadapterhandle: ConstPtr, physicaladdress: Long, length: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress.rawAddress.toCPointer<ByteVar>(), miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), physicaladdress, length)

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr, miniporthandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename.rawAddress.toCPointer<ByteVar>(), miniporthandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr): UInt =
    windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr, miniportadapterhandle: ConstPtr, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr, maximumlength: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle.rawAddress.toCPointer<ByteVar>(), miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), dmachannel, dma32bitaddresses, dmadescription.rawAddress.toCPointer<ByteVar>(), maximumlength)

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr, miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset.rawAddress.toCPointer<ByteVar>(), miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), initialport, numberofports)

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr, millisecondperiod: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(timer.rawAddress.toCPointer<ByteVar>(), millisecondperiod)
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep)
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr, virtualaddress: ConstPtr, length: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle.rawAddress.toCPointer<ByteVar>(), virtualaddress.rawAddress.toCPointer<ByteVar>(), length)
}

public actual fun ndisMWriteLogData(loghandle: ConstPtr, logbuffer: ConstPtr, logbuffersize: UInt): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle.rawAddress.toCPointer<ByteVar>(), logbuffer.rawAddress.toCPointer<ByteVar>(), logbuffersize)

public actual fun ndisMapFile(status: MutPtr, mappedbuffer: MutPtr, filehandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status.rawAddress.toCPointer<ByteVar>(), mappedbuffer.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr, configurationhandle: ConstPtr, index: UInt, keyname: MutPtr, keyhandle: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status.rawAddress.toCPointer<ByteVar>(), configurationhandle.rawAddress.toCPointer<ByteVar>(), index, keyname.rawAddress.toCPointer<ByteVar>(), keyhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr, configurationhandle: ConstPtr, subkeyname: ConstPtr, subkeyhandle: MutPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status.rawAddress.toCPointer<ByteVar>(), configurationhandle.rawAddress.toCPointer<ByteVar>(), subkeyname.rawAddress.toCPointer<ByteVar>(), subkeyhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisOpenFile(status: MutPtr, filehandle: MutPtr, filelength: MutPtr, filename: ConstPtr, highestacceptableaddress: Long) {
    windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>(), filelength.rawAddress.toCPointer<ByteVar>(), filename.rawAddress.toCPointer<ByteVar>(), highestacceptableaddress)
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr, ndisbindinghandle: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename.rawAddress.toCPointer<ByteVar>(), ndisbindinghandle.rawAddress.toCPointer<ByteVar>())

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr, bindingcontext: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename.rawAddress.toCPointer<ByteVar>(), bindingcontext.rawAddress.toCPointer<ByteVar>())

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisReadConfiguration(status: MutPtr, parametervalue: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametertype: NdisParameterType) {
    windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status.rawAddress.toCPointer<ByteVar>(), parametervalue.rawAddress.toCPointer<ByteVar>(), configurationhandle.rawAddress.toCPointer<ByteVar>(), keyword.rawAddress.toCPointer<ByteVar>(), parametertype)
}

public actual fun ndisReadNetworkAddress(status: MutPtr, networkaddress: MutPtr, networkaddresslength: MutPtr, configurationhandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(status.rawAddress.toCPointer<ByteVar>(), networkaddress.rawAddress.toCPointer<ByteVar>(), networkaddresslength.rawAddress.toCPointer<ByteVar>(), configurationhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun ndisReleaseReadWriteLock(lock: MutPtr, lockstate: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock.rawAddress.toCPointer<ByteVar>(), lockstate.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisResetEvent(event: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisSetEvent(event: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr, millisecondsperiod: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer.rawAddress.toCPointer<ByteVar>(), millisecondsperiod)
}

public actual fun ndisSetTimer(timer: ConstPtr, millisecondstodelay: UInt) {
    windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer.rawAddress.toCPointer<ByteVar>(), millisecondstodelay)
}

public actual fun ndisSetTimerEx(ndistimer: ConstPtr, millisecondstodelay: UInt, functioncontext: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer.rawAddress.toCPointer<ByteVar>(), millisecondstodelay, functioncontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisSetupDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status.rawAddress.toCPointer<ByteVar>(), ndisdmahandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), offset, length, writetodevice)
}

public actual fun ndisSystemProcessorCount(): Byte =
    windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount()

public actual fun ndisUnmapFile(filehandle: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr, length: UInt, virtualaddress: MutPtr, physicaladdress: Long) {
    windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle.rawAddress.toCPointer<ByteVar>(), length, virtualaddress.rawAddress.toCPointer<ByteVar>(), physicaladdress)
}

public actual fun ndisWaitEvent(event: ConstPtr, mstowait: UInt): Boolean =
    windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event.rawAddress.toCPointer<ByteVar>(), mstowait)

public actual fun ndisWriteConfiguration(status: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametervalue: ConstPtr) {
    windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status.rawAddress.toCPointer<ByteVar>(), configurationhandle.rawAddress.toCPointer<ByteVar>(), keyword.rawAddress.toCPointer<ByteVar>(), parametervalue.rawAddress.toCPointer<ByteVar>())
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle.rawAddress.toCPointer<ByteVar>(), errorcode, numberoferrorvalues, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr, datasize: UInt, data: ConstPtr): Int =
    windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle.rawAddress.toCPointer<ByteVar>(), eventcode, uniqueeventvalue, numstrings, stringslist.rawAddress.toCPointer<ByteVar>(), datasize, data.rawAddress.toCPointer<ByteVar>())
