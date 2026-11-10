@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

private val _windowsWdkNetworkmanagementNdisNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ndisAcquireReadWriteLock(lock: COpaquePointer?, fwrite: Boolean, lockstate: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock((lock?.value ?: 0L).toString(), fwrite, (lockstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: COpaquePointer?, length: UInt, tag: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag((virtualaddress?.value ?: 0L).toString(), length.toInt(), tag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer((timer?.value ?: 0L).toString(), (timercancelled?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClAddParty(ndisvchandle: COpaquePointer?, protocolpartycontext: COpaquePointer?, callparameters: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty((ndisvchandle?.value ?: 0L).toString(), (protocolpartycontext?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseAddressFamily(ndisafhandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily((ndisafhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseCall(ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall((ndisvchandle?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDeregisterSap(ndissaphandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap((ndissaphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDropParty(ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty((ndispartyhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(status, (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClMakeCall(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?, protocolpartycontext: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString(), (protocolpartycontext?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClModifyCallQoS(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClRegisterSap(ndisafhandle: COpaquePointer?, protocolsapcontext: COpaquePointer?, sap: COpaquePointer?, ndissaphandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap((ndisafhandle?.value ?: 0L).toString(), (protocolsapcontext?.value ?: 0L).toString(), (sap?.value ?: 0L).toString(), (ndissaphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCloseConfiguration(configurationhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration((configurationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCloseFile(filehandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile((filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(status, (ndispartyhandle?.value ?: 0L).toString(), (callmgrpartycontext?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(status, (ndisafhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(status, (ndisvchandle?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc((ndisvchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(status, (ndissaphandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected((ndisvchandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: COpaquePointer?, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall((ndissaphandle?.value ?: 0L).toString(), (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(closestatus, (ndisvchandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(dropstatus, (ndispartyhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(status, (ndispartyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(status, (ndisvchandle?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString(), (callmgrpartycontext?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(status, (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?, callmgrafcontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(status, (ndisafhandle?.value ?: 0L).toString(), (callmgrafcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: COpaquePointer?, callmgrsapcontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(status, (ndissaphandle?.value ?: 0L).toString(), (callmgrsapcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: COpaquePointer?, baseinstancename: COpaquePointer?, vcinstancename: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName((ndisvchandle?.value ?: 0L).toString(), (baseinstancename?.value ?: 0L).toString(), (vcinstancename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoCreateVc(ndisbindinghandle: COpaquePointer?, ndisafhandle: COpaquePointer?, protocolvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc((ndisbindinghandle?.value ?: 0L).toString(), (ndisafhandle?.value ?: 0L).toString(), (protocolvccontext?.value ?: 0L).toString(), (ndisvchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoDeleteVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc((ndisvchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoGetTapiCallId(ndisvchandle: COpaquePointer?, tapicallid: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId((ndisvchandle?.value ?: 0L).toString(), (tapicallid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCompleteDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer((status?.value ?: 0L).toString(), (ndisdmahandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCopyBuffer(status: COpaquePointer?, buffer: COpaquePointer?, poolhandle: COpaquePointer?, memorydescriptor: COpaquePointer?, offset: UInt, length: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer((status?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (poolhandle?.value ?: 0L).toString(), (memorydescriptor?.value ?: 0L).toString(), offset.toInt(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisDeregisterTdiCallBack() {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisFreeMemory(virtualaddress: COpaquePointer?, length: UInt, memoryflags: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory((virtualaddress?.value ?: 0L).toString(), length.toInt(), memoryflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId() as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetCurrentProcessorCounts(pidlecount: COpaquePointer?, pkernelanduser: COpaquePointer?, pindex: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts((pidlecount?.value ?: 0L).toString(), (pkernelanduser?.value ?: 0L).toString(), (pindex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage((pcpuusage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetRoutineAddress(ndisroutinename: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress((ndisroutinename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetSharedDataAlignment(): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetVersion(): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMAssociateMiniport(driverhandle: COpaquePointer?, protocolhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport((driverhandle?.value ?: 0L).toString(), (protocolhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: COpaquePointer?, deviceinstance: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance((driverhandle?.value ?: 0L).toString(), (deviceinstance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance((ndisminiporthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext((ndisbindinghandle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: COpaquePointer?, driverinstance: COpaquePointer?, devicecontext: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx((driverhandle?.value ?: 0L).toString(), (driverinstance?.value ?: 0L).toString(), (devicecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisInitializeEvent(event: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeReadWriteLock(lock: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock((lock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeString(destination: COpaquePointer?, source: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString((destination?.value ?: 0L).toString(), (source?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeTimer(timer: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer((timer?.value ?: 0L).toString(), 0L.toString(), (functioncontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory((miniportadapterhandle?.value ?: 0L).toString(), length.toInt(), cached, (virtualaddress?.value ?: 0L).toString(), (physicaladdress?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, context: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync((miniportadapterhandle?.value ?: 0L).toString(), length.toInt(), cached, (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer((timer?.value ?: 0L).toString(), (timercancelled?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCloseLog(loghandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog((loghandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmCreateVc(miniportadapterhandle: COpaquePointer?, ndisafhandle: COpaquePointer?, miniportvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc((miniportadapterhandle?.value ?: 0L).toString(), (ndisafhandle?.value ?: 0L).toString(), (miniportvccontext?.value ?: 0L).toString(), (ndisvchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc((ndisvchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeleteVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc((ndisvchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: COpaquePointer?, addressfamily: COpaquePointer?, cmcharacteristics: COpaquePointer?, sizeofcmcharacteristics: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily((miniportadapterhandle?.value ?: 0L).toString(), (addressfamily?.value ?: 0L).toString(), (cmcharacteristics?.value ?: 0L).toString(), sizeofcmcharacteristics.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(status, (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(status, (ndisvchandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCreateLog(miniportadapterhandle: COpaquePointer?, size: UInt, loghandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog((miniportadapterhandle?.value ?: 0L).toString(), size.toInt(), (loghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel((miniportdmahandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt, portoffset: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange((miniportadapterhandle?.value ?: 0L).toString(), initialport.toInt(), numberofports.toInt(), (portoffset?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFlushLog(loghandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog((loghandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory((miniportadapterhandle?.value ?: 0L).toString(), length.toInt(), cached, (virtualaddress?.value ?: 0L).toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: COpaquePointer?, physicaldeviceobject: COpaquePointer?, functionaldeviceobject: COpaquePointer?, nextdeviceobject: COpaquePointer?, allocatedresources: COpaquePointer?, allocatedresourcestranslated: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty((miniportadapterhandle?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (functionaldeviceobject?.value ?: 0L).toString(), (nextdeviceobject?.value ?: 0L).toString(), (allocatedresources?.value ?: 0L).toString(), (allocatedresourcestranslated?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: COpaquePointer?): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment((miniportadapterhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMInitializeTimer(timer: COpaquePointer?, miniportadapterhandle: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer((timer?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), 0L.toString(), (functioncontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMMapIoSpace(virtualaddress: COpaquePointer?, miniportadapterhandle: COpaquePointer?, physicaladdress: Long, length: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace((virtualaddress?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), physicaladdress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, miniporthandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName((padapterinstancename?.value ?: 0L).toString(), (miniporthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMReadDmaCounter(miniportdmahandle: COpaquePointer?): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter((miniportdmahandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: COpaquePointer?, miniportadapterhandle: COpaquePointer?, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: COpaquePointer?, maximumlength: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel((miniportdmahandle?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), dmachannel.toInt(), dma32bitaddresses, (dmadescription?.value ?: 0L).toString(), maximumlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterIoPortRange(portoffset: COpaquePointer?, miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange((portoffset?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), initialport.toInt(), numberofports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRemoveMiniport(miniporthandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport((miniporthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMSetPeriodicTimer(timer: COpaquePointer?, millisecondperiod: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer((timer?.value ?: 0L).toString(), millisecondperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(microsecondstosleep.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace((miniportadapterhandle?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMWriteLogData(loghandle: COpaquePointer?, logbuffer: COpaquePointer?, logbuffersize: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData((loghandle?.value ?: 0L).toString(), (logbuffer?.value ?: 0L).toString(), logbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMapFile(status: COpaquePointer?, mappedbuffer: COpaquePointer?, filehandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile((status?.value ?: 0L).toString(), (mappedbuffer?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByIndex(status: COpaquePointer?, configurationhandle: COpaquePointer?, index: UInt, keyname: COpaquePointer?, keyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex((status?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), index.toInt(), (keyname?.value ?: 0L).toString(), (keyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByName(status: COpaquePointer?, configurationhandle: COpaquePointer?, subkeyname: COpaquePointer?, subkeyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName((status?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), (subkeyname?.value ?: 0L).toString(), (subkeyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenFile(status: COpaquePointer?, filehandle: COpaquePointer?, filelength: COpaquePointer?, filename: COpaquePointer?, highestacceptableaddress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile((status?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), (filelength?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), highestacceptableaddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, ndisbindinghandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName((padapterinstancename?.value ?: 0L).toString(), (ndisbindinghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisQueryBindInstanceName(padapterinstancename: COpaquePointer?, bindingcontext: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName((padapterinstancename?.value ?: 0L).toString(), (bindingcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings((ndisprotocolhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadConfiguration(status: COpaquePointer?, parametervalue: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametertype: NdisParameterType) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration((status?.value ?: 0L).toString(), (parametervalue?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), (keyword?.value ?: 0L).toString(), parametertype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadNetworkAddress(status: COpaquePointer?, networkaddress: COpaquePointer?, networkaddresslength: COpaquePointer?, configurationhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress((status?.value ?: 0L).toString(), (networkaddress?.value ?: 0L).toString(), (networkaddresslength?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReleaseReadWriteLock(lock: COpaquePointer?, lockstate: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock((lock?.value ?: 0L).toString(), (lockstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisResetEvent(event: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetEvent(event: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetPeriodicTimer(ndistimer: COpaquePointer?, millisecondsperiod: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer((ndistimer?.value ?: 0L).toString(), millisecondsperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimer(timer: COpaquePointer?, millisecondstodelay: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer((timer?.value ?: 0L).toString(), millisecondstodelay.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimerEx(ndistimer: COpaquePointer?, millisecondstodelay: UInt, functioncontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx((ndistimer?.value ?: 0L).toString(), millisecondstodelay.toInt(), (functioncontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetupDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer((status?.value ?: 0L).toString(), (ndisdmahandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSystemProcessorCount(): Byte =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount() as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisUnmapFile(filehandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile((filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: COpaquePointer?, length: UInt, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory((ndisadapterhandle?.value ?: 0L).toString(), length.toInt(), (virtualaddress?.value ?: 0L).toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWaitEvent(event: COpaquePointer?, mstowait: UInt): Boolean =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent((event?.value ?: 0L).toString(), mstowait.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisWriteConfiguration(status: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametervalue: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration((status?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), (keyword?.value ?: 0L).toString(), (parametervalue?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: COpaquePointer?, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) {
        _windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry((ndisadapterhandle?.value ?: 0L).toString(), errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteEventLogEntry(loghandle: COpaquePointer?, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: COpaquePointer?, datasize: UInt, data: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAddon != null) (_windowsWdkNetworkmanagementNdisNapiAddon.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry((loghandle?.value ?: 0L).toString(), eventcode, uniqueeventvalue.toInt(), numstrings.toInt(), (stringslist?.value ?: 0L).toString(), datasize.toInt(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
