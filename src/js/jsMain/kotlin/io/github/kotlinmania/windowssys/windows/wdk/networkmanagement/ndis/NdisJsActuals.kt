@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

private val windowsWdkNetworkmanagementNdisNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ndisAcquireReadWriteLock(lock: MutPtr, fwrite: Boolean, lockstate: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock.rawAddress.toString(), fwrite, lockstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr, length: UInt, tag: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress.rawAddress.toString(), length.toInt(), tag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer.rawAddress.toString(), timercancelled.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClAddParty(ndisvchandle: ConstPtr, protocolpartycontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle.rawAddress.toString(), protocolpartycontext.rawAddress.toString(), callparameters.rawAddress.toString(), ndispartyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr, callparameters: MutPtr, protocolpartycontext: ConstPtr, ndispartyhandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString(), protocolpartycontext.rawAddress.toString(), ndispartyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle.rawAddress.toString(), protocolsapcontext.rawAddress.toString(), sap.rawAddress.toString(), ndissaphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCloseFile(filehandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr, callparameters: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status, ndispartyhandle.rawAddress.toString(), callmgrpartycontext.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status, ndisafhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status, ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status, ndissaphandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr, ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle.rawAddress.toString(), ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status, ndispartyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status, ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString(), callmgrpartycontext.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr, callmgrafcontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status, ndisafhandle.rawAddress.toString(), callmgrafcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr, callmgrsapcontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status, ndissaphandle.rawAddress.toString(), callmgrsapcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr, baseinstancename: ConstPtr, vcinstancename: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle.rawAddress.toString(), baseinstancename.rawAddress.toString(), vcinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr, ndisafhandle: ConstPtr, protocolvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle.rawAddress.toString(), ndisafhandle.rawAddress.toString(), protocolvccontext.rawAddress.toString(), ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr, tapicallid: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle.rawAddress.toString(), tapicallid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCompleteDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status.rawAddress.toString(), ndisdmahandle.rawAddress.toString(), buffer.rawAddress.toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCopyBuffer(status: MutPtr, buffer: MutPtr, poolhandle: ConstPtr, memorydescriptor: ConstPtr, offset: UInt, length: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(status.rawAddress.toString(), buffer.rawAddress.toString(), poolhandle.rawAddress.toString(), memorydescriptor.rawAddress.toString(), offset.toInt(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisDeregisterTdiCallBack() {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisFreeMemory(virtualaddress: ConstPtr, length: UInt, memoryflags: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress.rawAddress.toString(), length.toInt(), memoryflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId() as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr, pkernelanduser: MutPtr, pindex: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount.rawAddress.toString(), pkernelanduser.rawAddress.toString(), pindex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr): MutPtr =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) MutPtr((windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetSharedDataAlignment(): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetVersion(): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr, protocolhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle.rawAddress.toString(), protocolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr, deviceinstance: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle.rawAddress.toString(), deviceinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr): MutPtr =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) MutPtr((windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr, driverinstance: ConstPtr, devicecontext: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle.rawAddress.toString(), driverinstance.rawAddress.toString(), devicecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisInitializeEvent(event: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeReadWriteLock(lock: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeString(destination: MutPtr, source: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeTimer(timer: MutPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer.rawAddress.toString(), 0L.toString(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: MutPtr, physicaladdress: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, virtualaddress.rawAddress.toString(), physicaladdress.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, context: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer.rawAddress.toString(), timercancelled.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCloseLog(loghandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr, ndisafhandle: ConstPtr, miniportvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle.rawAddress.toString(), ndisafhandle.rawAddress.toString(), miniportvccontext.rawAddress.toString(), ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr, addressfamily: MutPtr, cmcharacteristics: MutPtr, sizeofcmcharacteristics: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle.rawAddress.toString(), addressfamily.rawAddress.toString(), cmcharacteristics.rawAddress.toString(), sizeofcmcharacteristics.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status, ndisvchandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr, size: UInt, loghandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle.rawAddress.toString(), size.toInt(), loghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt, portoffset: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle.rawAddress.toString(), initialport.toInt(), numberofports.toInt(), portoffset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFlushLog(loghandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: ConstPtr, physicaladdress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, virtualaddress.rawAddress.toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr, physicaldeviceobject: MutPtr, functionaldeviceobject: MutPtr, nextdeviceobject: MutPtr, allocatedresources: MutPtr, allocatedresourcestranslated: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), functionaldeviceobject.rawAddress.toString(), nextdeviceobject.rawAddress.toString(), allocatedresources.rawAddress.toString(), allocatedresourcestranslated.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMInitializeTimer(timer: ConstPtr, miniportadapterhandle: ConstPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), 0L.toString(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr, miniportadapterhandle: ConstPtr, physicaladdress: Long, length: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), physicaladdress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr, miniporthandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename.rawAddress.toString(), miniporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr, miniportadapterhandle: ConstPtr, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr, maximumlength: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), dmachannel.toInt(), dma32bitaddresses, dmadescription.rawAddress.toString(), maximumlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr, miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), initialport.toInt(), numberofports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr, millisecondperiod: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(timer.rawAddress.toString(), millisecondperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr, virtualaddress: ConstPtr, length: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle.rawAddress.toString(), virtualaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMWriteLogData(loghandle: ConstPtr, logbuffer: ConstPtr, logbuffersize: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle.rawAddress.toString(), logbuffer.rawAddress.toString(), logbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMapFile(status: MutPtr, mappedbuffer: MutPtr, filehandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status.rawAddress.toString(), mappedbuffer.rawAddress.toString(), filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr, configurationhandle: ConstPtr, index: UInt, keyname: MutPtr, keyhandle: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), index.toInt(), keyname.rawAddress.toString(), keyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr, configurationhandle: ConstPtr, subkeyname: ConstPtr, subkeyhandle: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), subkeyname.rawAddress.toString(), subkeyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenFile(status: MutPtr, filehandle: MutPtr, filelength: MutPtr, filename: ConstPtr, highestacceptableaddress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status.rawAddress.toString(), filehandle.rawAddress.toString(), filelength.rawAddress.toString(), filename.rawAddress.toString(), highestacceptableaddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr, ndisbindinghandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename.rawAddress.toString(), ndisbindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr, bindingcontext: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename.rawAddress.toString(), bindingcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadConfiguration(status: MutPtr, parametervalue: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametertype: NdisParameterType) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status.rawAddress.toString(), parametervalue.rawAddress.toString(), configurationhandle.rawAddress.toString(), keyword.rawAddress.toString(), parametertype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadNetworkAddress(status: MutPtr, networkaddress: MutPtr, networkaddresslength: MutPtr, configurationhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(status.rawAddress.toString(), networkaddress.rawAddress.toString(), networkaddresslength.rawAddress.toString(), configurationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReleaseReadWriteLock(lock: MutPtr, lockstate: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock.rawAddress.toString(), lockstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisResetEvent(event: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetEvent(event: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr, millisecondsperiod: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer.rawAddress.toString(), millisecondsperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimer(timer: ConstPtr, millisecondstodelay: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer.rawAddress.toString(), millisecondstodelay.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimerEx(ndistimer: ConstPtr, millisecondstodelay: UInt, functioncontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer.rawAddress.toString(), millisecondstodelay.toInt(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetupDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status.rawAddress.toString(), ndisdmahandle.rawAddress.toString(), buffer.rawAddress.toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSystemProcessorCount(): Byte =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount() as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisUnmapFile(filehandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr, length: UInt, virtualaddress: MutPtr, physicaladdress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle.rawAddress.toString(), length.toInt(), virtualaddress.rawAddress.toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWaitEvent(event: ConstPtr, mstowait: UInt): Boolean =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event.rawAddress.toString(), mstowait.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisWriteConfiguration(status: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametervalue: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), keyword.rawAddress.toString(), parametervalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle.rawAddress.toString(), errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr, datasize: UInt, data: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle.rawAddress.toString(), eventcode, uniqueeventvalue.toInt(), numstrings.toInt(), stringslist.rawAddress.toString(), datasize.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
