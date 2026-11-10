@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWin32DevicesHumaninterfacedeviceNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: COpaquePointer?, ppvout: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create((hinst?.value ?: 0L).toString(), dwversion.toInt(), (riidltf?.value ?: 0L).toString(), (ppvout?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue((hiddeviceobject?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(preparseddata.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes((hiddeviceobject?.value ?: 0L).toString(), (attributes?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration((hiddeviceobject?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), configurationlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetHidGuid(hidguid: COpaquePointer?) {
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) {
        _windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid((hidguid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString((hiddeviceobject?.value ?: 0L).toString(), stringindex.toInt(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers((hiddeviceobject?.value ?: 0L).toString(), (numberbuffers?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData((hiddeviceobject?.value ?: 0L).toString(), (preparseddata?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration((hiddeviceobject?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), configurationlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers((hiddeviceobject?.value ?: 0L).toString(), numberbuffers.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (buttondata?.value ?: 0L).toString(), (buttondatalength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(reporttype, (buttoncaps?.value ?: 0L).toString(), (buttoncapslength?.value ?: 0L).toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(preparseddata.toString(), (capabilities?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(reporttype, (datalist?.value ?: 0L).toString(), (datalength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: COpaquePointer?, lengthattributes: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(reporttype, dataindex.toInt(), preparseddata.toString(), (attributes?.value ?: 0L).toString(), (lengthattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: COpaquePointer?, linkcollectionnodeslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes((linkcollectionnodes?.value ?: 0L).toString(), (linkcollectionnodeslength?.value ?: 0L).toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (buttoncaps?.value ?: 0L).toString(), (buttoncapslength?.value ?: 0L).toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (valuecaps?.value ?: 0L).toString(), (valuecapslength?.value ?: 0L).toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), usagevaluebytelength.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), (usagelist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(reporttype, linkcollection.toInt(), (buttonlist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(reporttype, (valuecaps?.value ?: 0L).toString(), (valuecapslength?.value ?: 0L).toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(reporttype, reportid.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(reporttype, preparseddata.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(reporttype, usagepage.toInt(), preparseddata.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (buttondata?.value ?: 0L).toString(), buttondatalength.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(reporttype, (datalist?.value ?: 0L).toString(), (datalength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue, preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), usagevaluebytelength.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), (usagelist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: COpaquePointer?, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: COpaquePointer?, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes((changedusagelist?.value ?: 0L).toString(), usagelistlength.toInt(), keyaction, (modifierstate?.value ?: 0L).toString(), 0L.toString(), (insertcodescontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), (usagelist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUsageListDifference(previoususagelist: COpaquePointer?, currentusagelist: COpaquePointer?, breakusagelist: COpaquePointer?, makeusagelist: COpaquePointer?, usagelistlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference((previoususagelist?.value ?: 0L).toString(), (currentusagelist?.value ?: 0L).toString(), (breakusagelist?.value ?: 0L).toString(), (makeusagelist?.value ?: 0L).toString(), usagelistlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
