@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val windowsWin32DevicesHumaninterfacedeviceNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr<Guid>, ppvout: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(hinst.rawAddress.toString(), dwversion.toInt(), riidltf.rawAddress.toString(), ppvout.rawAddress.toString(), punkouter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(hiddeviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr<HiddAttributes>): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(hiddeviceobject.rawAddress.toString(), attributes.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr<HiddConfiguration>, configurationlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(hiddeviceobject.rawAddress.toString(), configuration.rawAddress.toString(), configurationlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr<CVoid>, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetHidGuid(hidguid: MutPtr<Guid>) {
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) {
        windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(hidguid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(hiddeviceobject.rawAddress.toString(), stringindex.toInt(), buffer.rawAddress.toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr<CVoid>, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr<UInt>): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(hiddeviceobject.rawAddress.toString(), numberbuffers.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr<PhidpPreparsedData>): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(hiddeviceobject.rawAddress.toString(), preparseddata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr<HiddConfiguration>, configurationlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(hiddeviceobject.rawAddress.toString(), configuration.rawAddress.toString(), configurationlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr<CVoid>, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(hiddeviceobject.rawAddress.toString(), numberbuffers.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr<CVoid>, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr<HidpButtonArrayData>, buttondatalength: MutPtr<UShort>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttondata.rawAddress.toString(), buttondatalength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr<HidpButtonCaps>, buttoncapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(reporttype, buttoncaps.rawAddress.toString(), buttoncapslength.rawAddress.toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr<HidpCaps>): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(preparseddata.toString(), capabilities.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr<HidpData>, datalength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(reporttype, datalist.rawAddress.toString(), datalength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr<HidpExtendedAttributes>, lengthattributes: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(reporttype, dataindex.toInt(), preparseddata.toString(), attributes.rawAddress.toString(), lengthattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr<HidpLinkCollectionNode>, linkcollectionnodeslength: MutPtr<UInt>, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(linkcollectionnodes.rawAddress.toString(), linkcollectionnodeslength.rawAddress.toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr<Int>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr<HidpButtonCaps>, buttoncapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttoncaps.rawAddress.toString(), buttoncapslength.rawAddress.toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr<HidpValueCaps>, valuecapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), valuecaps.rawAddress.toString(), valuecapslength.rawAddress.toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), usagevaluebytelength.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr<UShort>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr<UsageAndPage>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(reporttype, linkcollection.toInt(), buttonlist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr<HidpValueCaps>, valuecapslength: MutPtr<UShort>, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(reporttype, valuecaps.rawAddress.toString(), valuecapslength.rawAddress.toString(), preparseddata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(reporttype, reportid.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype, preparseddata.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype, usagepage.toInt(), preparseddata.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr<HidpButtonArrayData>, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttondata.rawAddress.toString(), buttondatalength.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr<HidpData>, datalength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(reporttype, datalist.rawAddress.toString(), datalength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue, preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), usagevaluebytelength.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr<UShort>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr<UShort>, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr<HidpKeyboardModifierState>, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(changedusagelist.rawAddress.toString(), usagelistlength.toInt(), keyaction, modifierstate.rawAddress.toString(), 0L.toString(), insertcodescontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr<UShort>, usagelength: MutPtr<UInt>, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUsageListDifference(previoususagelist: ConstPtr<UShort>, currentusagelist: ConstPtr<UShort>, breakusagelist: MutPtr<UShort>, makeusagelist: MutPtr<UShort>, usagelistlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(previoususagelist.rawAddress.toString(), currentusagelist.rawAddress.toString(), breakusagelist.rawAddress.toString(), makeusagelist.rawAddress.toString(), usagelistlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
