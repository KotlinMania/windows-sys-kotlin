@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING

private val _windowsWdkNetworkmanagementNdisNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock(lock.toString(), fwrite, lockstate.toString())
    }
}

public actual fun NdisAllocateMemoryWithTag(virtualaddress: Long, length: UInt, tag: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag(virtualaddress.toString(), length.toInt(), tag.toInt()) as Int) else 0

public actual fun NdisCancelTimer(timer: Long, timercancelled: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer(timer.toString(), timercancelled.toString())
    }
}

public actual fun NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty(ndisvchandle.toString(), protocolpartycontext.toString(), callparameters.toString(), ndispartyhandle.toString()) as Int) else 0

public actual fun NdisClCloseAddressFamily(ndisafhandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily(ndisafhandle.toString()) as Int) else 0

public actual fun NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall(ndisvchandle.toString(), ndispartyhandle.toString(), buffer.toString(), size.toInt()) as Int) else 0

public actual fun NdisClDeregisterSap(ndissaphandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap(ndissaphandle.toString()) as Int) else 0

public actual fun NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty(ndispartyhandle.toString(), buffer.toString(), size.toInt()) as Int) else 0

public actual fun NdisClGetProtocolVcContextFromTapiCallId(tapicallid: UNICODE_STRING, protocolvccontext: Long): Int =
    0

public actual fun NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete(status, ndisvchandle.toString(), callparameters.toString())
    }
}

public actual fun NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall(ndisvchandle.toString(), callparameters.toString(), protocolpartycontext.toString(), ndispartyhandle.toString()) as Int) else 0

public actual fun NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS(ndisvchandle.toString(), callparameters.toString()) as Int) else 0

public actual fun NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap(ndisafhandle.toString(), protocolsapcontext.toString(), sap.toString(), ndissaphandle.toString()) as Int) else 0

public actual fun NdisCloseConfiguration(configurationhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration(configurationhandle.toString())
    }
}

public actual fun NdisCloseFile(filehandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile(filehandle.toString())
    }
}

public actual fun NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc(ndisvchandle.toString(), callparameters.toString()) as Int) else 0

public actual fun NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete(status, ndispartyhandle.toString(), callmgrpartycontext.toString(), callparameters.toString())
    }
}

public actual fun NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete(status, ndisafhandle.toString())
    }
}

public actual fun NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete(status, ndisvchandle.toString(), ndispartyhandle.toString())
    }
}

public actual fun NdisCmDeactivateVc(ndisvchandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc(ndisvchandle.toString()) as Int) else 0

public actual fun NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete(status, ndissaphandle.toString())
    }
}

public actual fun NdisCmDispatchCallConnected(ndisvchandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected(ndisvchandle.toString())
    }
}

public actual fun NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall(ndissaphandle.toString(), ndisvchandle.toString(), callparameters.toString()) as Int) else 0

public actual fun NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange(ndisvchandle.toString(), callparameters.toString())
    }
}

public actual fun NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.toString(), buffer.toString(), size.toInt())
    }
}

public actual fun NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.toString(), buffer.toString(), size.toInt())
    }
}

public actual fun NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete(status, ndispartyhandle.toString())
    }
}

public actual fun NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete(status, ndisvchandle.toString(), ndispartyhandle.toString(), callmgrpartycontext.toString(), callparameters.toString())
    }
}

public actual fun NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete(status, ndisvchandle.toString(), callparameters.toString())
    }
}

public actual fun NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete(status, ndisafhandle.toString(), callmgrafcontext.toString())
    }
}

public actual fun NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete(status, ndissaphandle.toString(), callmgrsapcontext.toString())
    }
}

public actual fun NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName(ndisvchandle.toString(), baseinstancename.toString(), vcinstancename.toString()) as Int) else 0

public actual fun NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc(ndisbindinghandle.toString(), ndisafhandle.toString(), protocolvccontext.toString(), ndisvchandle.toString()) as Int) else 0

public actual fun NdisCoDeleteVc(ndisvchandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc(ndisvchandle.toString()) as Int) else 0

public actual fun NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId(ndisvchandle.toString(), tapicallid.toString()) as Int) else 0

public actual fun NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer(status.toString(), ndisdmahandle.toString(), buffer.toString(), offset.toInt(), length.toInt(), writetodevice)
    }
}

public actual fun NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: UInt, length: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer(status.toString(), buffer.toString(), poolhandle.toString(), memorydescriptor.toString(), offset.toInt(), length.toInt())
    }
}

public actual fun NdisDeregisterTdiCallBack() {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack()
    }
}

public actual fun NdisFreeMemory(virtualaddress: Long, length: UInt, memoryflags: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory(virtualaddress.toString(), length.toInt(), memoryflags.toInt())
    }
}

public actual fun NdisGeneratePartialCancelId(): UByte =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId() as Int).toUByte() else 0u

public actual fun NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts(pidlecount.toString(), pkernelanduser.toString(), pindex.toString())
    }
}

public actual fun NdisGetCurrentProcessorCpuUsage(pcpuusage: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage(pcpuusage.toString())
    }
}

public actual fun NdisGetRoutineAddress(ndisroutinename: Long): Long =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress(ndisroutinename.toString()) as String).toLong() else 0L

public actual fun NdisGetSharedDataAlignment(): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment() as Int).toUInt() else 0u

public actual fun NdisGetVersion(): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion() as Int).toUInt() else 0u

public actual fun NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport(driverhandle.toString(), protocolhandle.toString())
    }
}

public actual fun NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance(driverhandle.toString(), deviceinstance.toString()) as Int) else 0

public actual fun NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance(ndisminiporthandle.toString()) as Int) else 0

public actual fun NdisIMGetBindingContext(ndisbindinghandle: Long): Long =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext(ndisbindinghandle.toString()) as String).toLong() else 0L

public actual fun NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx(driverhandle.toString(), driverinstance.toString(), devicecontext.toString()) as Int) else 0

public actual fun NdisInitializeEvent(event: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent(event.toString())
    }
}

public actual fun NdisInitializeReadWriteLock(lock: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock(lock.toString())
    }
}

public actual fun NdisInitializeString(destination: Long, source: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString(destination.toString(), source.toString())
    }
}

public actual fun NdisInitializeTimer(timer: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer(timer.toString(), timerfunction.toLong().toString(), functioncontext.toString())
    }
}

public actual fun NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory(miniportadapterhandle.toString(), length.toInt(), cached, virtualaddress.toString(), physicaladdress.toString())
    }
}

public actual fun NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: UInt, cached: Boolean, context: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync(miniportadapterhandle.toString(), length.toInt(), cached, context.toString()) as Int) else 0

public actual fun NdisMCancelTimer(timer: Long, timercancelled: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer(timer.toString(), timercancelled.toString())
    }
}

public actual fun NdisMCloseLog(loghandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog(loghandle.toString())
    }
}

public actual fun NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc(ndisvchandle.toString(), callparameters.toString()) as Int) else 0

public actual fun NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc(miniportadapterhandle.toString(), ndisafhandle.toString(), miniportvccontext.toString(), ndisvchandle.toString()) as Int) else 0

public actual fun NdisMCmDeactivateVc(ndisvchandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc(ndisvchandle.toString()) as Int) else 0

public actual fun NdisMCmDeleteVc(ndisvchandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc(ndisvchandle.toString()) as Int) else 0

public actual fun NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily(miniportadapterhandle.toString(), addressfamily.toString(), cmcharacteristics.toString(), sizeofcmcharacteristics.toInt()) as Int) else 0

public actual fun NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete(status, ndisvchandle.toString(), callparameters.toString())
    }
}

public actual fun NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete(status, ndisvchandle.toString())
    }
}

public actual fun NdisMCreateLog(miniportadapterhandle: Long, size: UInt, loghandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog(miniportadapterhandle.toString(), size.toInt(), loghandle.toString()) as Int) else 0

public actual fun NdisMDeregisterDmaChannel(miniportdmahandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel(miniportdmahandle.toString())
    }
}

public actual fun NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: UInt, numberofports: UInt, portoffset: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange(miniportadapterhandle.toString(), initialport.toInt(), numberofports.toInt(), portoffset.toString())
    }
}

public actual fun NdisMFlushLog(loghandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog(loghandle.toString())
    }
}

public actual fun NdisMFreeSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory(miniportadapterhandle.toString(), length.toInt(), cached, virtualaddress.toString(), physicaladdress.toString())
    }
}

public actual fun NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty(miniportadapterhandle.toString(), physicaldeviceobject.toString(), functionaldeviceobject.toString(), nextdeviceobject.toString(), allocatedresources.toString(), allocatedresourcestranslated.toString())
    }
}

public actual fun NdisMGetDmaAlignment(miniportadapterhandle: Long): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment(miniportadapterhandle.toString()) as Int).toUInt() else 0u

public actual fun NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer(timer.toString(), miniportadapterhandle.toString(), timerfunction.toLong().toString(), functioncontext.toString())
    }
}

public actual fun NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace(virtualaddress.toString(), miniportadapterhandle.toString(), physicaladdress.toString(), length.toInt()) as Int) else 0

public actual fun NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName(padapterinstancename.toString(), miniporthandle.toString()) as Int) else 0

public actual fun NdisMReadDmaCounter(miniportdmahandle: Long): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter(miniportdmahandle.toString()) as Int).toUInt() else 0u

public actual fun NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel(miniportdmahandle.toString(), miniportadapterhandle.toString(), dmachannel.toInt(), dma32bitaddresses, dmadescription.toString(), maximumlength.toInt()) as Int) else 0

public actual fun NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: UInt, numberofports: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange(portoffset.toString(), miniportadapterhandle.toString(), initialport.toInt(), numberofports.toInt()) as Int) else 0

public actual fun NdisMRemoveMiniport(miniporthandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport(miniporthandle.toString()) as Int) else 0

public actual fun NdisMSetPeriodicTimer(timer: Long, millisecondperiod: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer(timer.toString(), millisecondperiod.toInt())
    }
}

public actual fun NdisMSleep(microsecondstosleep: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep(microsecondstosleep.toInt())
    }
}

public actual fun NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace(miniportadapterhandle.toString(), virtualaddress.toString(), length.toInt())
    }
}

public actual fun NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData(loghandle.toString(), logbuffer.toString(), logbuffersize.toInt()) as Int) else 0

public actual fun NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile(status.toString(), mappedbuffer.toString(), filehandle.toString())
    }
}

public actual fun NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: UInt, keyname: Long, keyhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex(status.toString(), configurationhandle.toString(), index.toInt(), keyname.toString(), keyhandle.toString())
    }
}

public actual fun NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName(status.toString(), configurationhandle.toString(), subkeyname.toString(), subkeyhandle.toString())
    }
}

public actual fun NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile(status.toString(), filehandle.toString(), filelength.toString(), filename.toString(), highestacceptableaddress.toString())
    }
}

public actual fun NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName(padapterinstancename.toString(), ndisbindinghandle.toString()) as Int) else 0

public actual fun NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName(padapterinstancename.toString(), bindingcontext.toString()) as Int) else 0

public actual fun NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings(ndisprotocolhandle.toString())
    }
}

public actual fun NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: NDIS_PARAMETER_TYPE) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration(status.toString(), parametervalue.toString(), configurationhandle.toString(), keyword.toString(), parametertype)
    }
}

public actual fun NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress(status.toString(), networkaddress.toString(), networkaddresslength.toString(), configurationhandle.toString())
    }
}

public actual fun NdisRegisterTdiCallBack(registercallback: TDI_REGISTER_CALLBACK, pnphandler: TDI_PNP_HANDLER) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack(registercallback.toLong().toString(), pnphandler.toLong().toString())
    }
}

public actual fun NdisReleaseReadWriteLock(lock: Long, lockstate: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock(lock.toString(), lockstate.toString())
    }
}

public actual fun NdisResetEvent(event: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent(event.toString())
    }
}

public actual fun NdisSetEvent(event: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent(event.toString())
    }
}

public actual fun NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer(ndistimer.toString(), millisecondsperiod.toInt())
    }
}

public actual fun NdisSetTimer(timer: Long, millisecondstodelay: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer(timer.toString(), millisecondstodelay.toInt())
    }
}

public actual fun NdisSetTimerEx(ndistimer: Long, millisecondstodelay: UInt, functioncontext: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx(ndistimer.toString(), millisecondstodelay.toInt(), functioncontext.toString())
    }
}

public actual fun NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer(status.toString(), ndisdmahandle.toString(), buffer.toString(), offset.toInt(), length.toInt(), writetodevice)
    }
}

public actual fun NdisSystemProcessorCount(): Byte =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount() as Int).toByte() else 0

public actual fun NdisUnmapFile(filehandle: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile(filehandle.toString())
    }
}

public actual fun NdisUpdateSharedMemory(ndisadapterhandle: Long, length: UInt, virtualaddress: Long, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory(ndisadapterhandle.toString(), length.toInt(), virtualaddress.toString(), physicaladdress.toString())
    }
}

public actual fun NdisWaitEvent(event: Long, mstowait: UInt): Boolean =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent(event.toString(), mstowait.toInt()) as Boolean) else false

public actual fun NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration(status.toString(), configurationhandle.toString(), keyword.toString(), parametervalue.toString())
    }
}

public actual fun NdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: UInt, numberoferrorvalues: UInt) {
}

public actual fun NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: Long, datasize: UInt, data: Long): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry(loghandle.toString(), eventcode, uniqueeventvalue.toInt(), numstrings.toInt(), stringslist.toString(), datasize.toInt(), data.toString()) as Int) else 0
