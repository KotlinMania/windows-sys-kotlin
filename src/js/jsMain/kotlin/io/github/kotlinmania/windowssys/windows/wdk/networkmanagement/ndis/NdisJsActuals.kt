@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

private val windowsWdkNetworkmanagementNdisNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ndisAcquireReadWriteLock(lock: MutPtr<NdisRwLock>, fwrite: Boolean, lockstate: MutPtr<LockState>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock.rawAddress.toString(), fwrite, lockstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr<MutPtr<CVoid>>, length: UInt, tag: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress.rawAddress.toString(), length.toInt(), tag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCancelTimer(timer: ConstPtr<NdisTimer>, timercancelled: MutPtr<Boolean>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer.rawAddress.toString(), timercancelled.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClAddParty(ndisvchandle: ConstPtr<CVoid>, protocolpartycontext: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle.rawAddress.toString(), protocolpartycontext.rawAddress.toString(), callparameters.rawAddress.toString(), ndispartyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, protocolpartycontext: ConstPtr<CVoid>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString(), protocolpartycontext.rawAddress.toString(), ndispartyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr<CVoid>, protocolsapcontext: ConstPtr<CVoid>, sap: ConstPtr<CoSap>, ndissaphandle: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle.rawAddress.toString(), protocolsapcontext.rawAddress.toString(), sap.rawAddress.toString(), ndissaphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCloseFile(filehandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status, ndispartyhandle.rawAddress.toString(), callmgrpartycontext.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status, ndisafhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status, ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status, ndissaphandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr<CVoid>, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle.rawAddress.toString(), ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status, ndispartyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status, ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString(), callmgrpartycontext.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>, callmgrafcontext: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status, ndisafhandle.rawAddress.toString(), callmgrafcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>, callmgrsapcontext: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status, ndissaphandle.rawAddress.toString(), callmgrsapcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr<CVoid>, baseinstancename: ConstPtr<UnicodeString>, vcinstancename: MutPtr<UnicodeString>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle.rawAddress.toString(), baseinstancename.rawAddress.toString(), vcinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, protocolvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle.rawAddress.toString(), ndisafhandle.rawAddress.toString(), protocolvccontext.rawAddress.toString(), ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr<CVoid>, tapicallid: MutPtr<VarString>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle.rawAddress.toString(), tapicallid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCompleteDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status.rawAddress.toString(), ndisdmahandle.rawAddress.toString(), buffer.rawAddress.toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCopyBuffer(status: MutPtr<Int>, buffer: MutPtr<MutPtr<Mdl>>, poolhandle: ConstPtr<CVoid>, memorydescriptor: ConstPtr<CVoid>, offset: UInt, length: UInt) {
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

public actual fun ndisFreeMemory(virtualaddress: ConstPtr<CVoid>, length: UInt, memoryflags: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress.rawAddress.toString(), length.toInt(), memoryflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId() as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr<UInt>, pkernelanduser: MutPtr<UInt>, pindex: MutPtr<UInt>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount.rawAddress.toString(), pkernelanduser.rawAddress.toString(), pindex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr<UInt>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) MutPtr((windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetSharedDataAlignment(): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetVersion(): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr<CVoid>, protocolhandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle.rawAddress.toString(), protocolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr<CVoid>, deviceinstance: ConstPtr<UnicodeString>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle.rawAddress.toString(), deviceinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) MutPtr((windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr<CVoid>, driverinstance: ConstPtr<UnicodeString>, devicecontext: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle.rawAddress.toString(), driverinstance.rawAddress.toString(), devicecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisInitializeEvent(event: MutPtr<NdisEvent>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeReadWriteLock(lock: MutPtr<NdisRwLock>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeString(destination: MutPtr<UnicodeString>, source: ConstPtr<UByte>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeTimer(timer: MutPtr<NdisTimer>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer.rawAddress.toString(), 0L.toString(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: MutPtr<MutPtr<CVoid>>, physicaladdress: MutPtr<Long>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, virtualaddress.rawAddress.toString(), physicaladdress.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, context: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCancelTimer(timer: ConstPtr<NdisMiniportTimer>, timercancelled: MutPtr<Boolean>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer.rawAddress.toString(), timercancelled.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCloseLog(loghandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, miniportvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle.rawAddress.toString(), ndisafhandle.rawAddress.toString(), miniportvccontext.rawAddress.toString(), ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr<CVoid>, addressfamily: MutPtr<CoAddressFamily>, cmcharacteristics: MutPtr<NdisCallManagerCharacteristics>, sizeofcmcharacteristics: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle.rawAddress.toString(), addressfamily.rawAddress.toString(), cmcharacteristics.rawAddress.toString(), sizeofcmcharacteristics.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status, ndisvchandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr<CVoid>, size: UInt, loghandle: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle.rawAddress.toString(), size.toInt(), loghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt, portoffset: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle.rawAddress.toString(), initialport.toInt(), numberofports.toInt(), portoffset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFlushLog(loghandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: ConstPtr<CVoid>, physicaladdress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, virtualaddress.rawAddress.toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr<CVoid>, physicaldeviceobject: MutPtr<MutPtr<DeviceObject>>, functionaldeviceobject: MutPtr<MutPtr<DeviceObject>>, nextdeviceobject: MutPtr<MutPtr<DeviceObject>>, allocatedresources: MutPtr<MutPtr<CmResourceList>>, allocatedresourcestranslated: MutPtr<MutPtr<CmResourceList>>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), functionaldeviceobject.rawAddress.toString(), nextdeviceobject.rawAddress.toString(), allocatedresources.rawAddress.toString(), allocatedresourcestranslated.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr<CVoid>): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMInitializeTimer(timer: ConstPtr<NdisMiniportTimer>, miniportadapterhandle: ConstPtr<CVoid>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), 0L.toString(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, physicaladdress: Long, length: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), physicaladdress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, miniporthandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename.rawAddress.toString(), miniporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr<CVoid>): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr<NdisDmaDescription>, maximumlength: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), dmachannel.toInt(), dma32bitaddresses, dmadescription.rawAddress.toString(), maximumlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), initialport.toInt(), numberofports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr<NdisMiniportTimer>, millisecondperiod: UInt) {
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

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr<CVoid>, virtualaddress: ConstPtr<CVoid>, length: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle.rawAddress.toString(), virtualaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMWriteLogData(loghandle: ConstPtr<CVoid>, logbuffer: ConstPtr<CVoid>, logbuffersize: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle.rawAddress.toString(), logbuffer.rawAddress.toString(), logbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMapFile(status: MutPtr<Int>, mappedbuffer: MutPtr<MutPtr<CVoid>>, filehandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status.rawAddress.toString(), mappedbuffer.rawAddress.toString(), filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, index: UInt, keyname: MutPtr<UnicodeString>, keyhandle: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), index.toInt(), keyname.rawAddress.toString(), keyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, subkeyname: ConstPtr<UnicodeString>, subkeyhandle: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), subkeyname.rawAddress.toString(), subkeyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenFile(status: MutPtr<Int>, filehandle: MutPtr<MutPtr<CVoid>>, filelength: MutPtr<UInt>, filename: ConstPtr<UnicodeString>, highestacceptableaddress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status.rawAddress.toString(), filehandle.rawAddress.toString(), filelength.rawAddress.toString(), filename.rawAddress.toString(), highestacceptableaddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, ndisbindinghandle: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename.rawAddress.toString(), ndisbindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr<UnicodeString>, bindingcontext: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename.rawAddress.toString(), bindingcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadConfiguration(status: MutPtr<Int>, parametervalue: MutPtr<MutPtr<NdisConfigurationParameter>>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametertype: NdisParameterType) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status.rawAddress.toString(), parametervalue.rawAddress.toString(), configurationhandle.rawAddress.toString(), keyword.rawAddress.toString(), parametertype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadNetworkAddress(status: MutPtr<Int>, networkaddress: MutPtr<MutPtr<CVoid>>, networkaddresslength: MutPtr<UInt>, configurationhandle: ConstPtr<CVoid>) {
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

public actual fun ndisReleaseReadWriteLock(lock: MutPtr<NdisRwLock>, lockstate: ConstPtr<LockState>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock.rawAddress.toString(), lockstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisResetEvent(event: ConstPtr<NdisEvent>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetEvent(event: ConstPtr<NdisEvent>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr<NdisTimer>, millisecondsperiod: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer.rawAddress.toString(), millisecondsperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimer(timer: ConstPtr<NdisTimer>, millisecondstodelay: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer.rawAddress.toString(), millisecondstodelay.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimerEx(ndistimer: ConstPtr<NdisTimer>, millisecondstodelay: UInt, functioncontext: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer.rawAddress.toString(), millisecondstodelay.toInt(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetupDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status.rawAddress.toString(), ndisdmahandle.rawAddress.toString(), buffer.rawAddress.toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSystemProcessorCount(): Byte =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount() as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisUnmapFile(filehandle: ConstPtr<CVoid>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr<CVoid>, length: UInt, virtualaddress: MutPtr<CVoid>, physicaladdress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle.rawAddress.toString(), length.toInt(), virtualaddress.rawAddress.toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWaitEvent(event: ConstPtr<NdisEvent>, mstowait: UInt): Boolean =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event.rawAddress.toString(), mstowait.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisWriteConfiguration(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametervalue: ConstPtr<NdisConfigurationParameter>) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), keyword.rawAddress.toString(), parametervalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr<CVoid>, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) {
        windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle.rawAddress.toString(), errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr<CVoid>, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr<CVoid>, datasize: UInt, data: ConstPtr<CVoid>): Int =
    if (windowsWdkNetworkmanagementNdisNapiAddon != null) (windowsWdkNetworkmanagementNdisNapiAddon.windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle.rawAddress.toString(), eventcode, uniqueeventvalue.toInt(), numstrings.toInt(), stringslist.rawAddress.toString(), datasize.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
