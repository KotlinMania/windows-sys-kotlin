@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWin32DevicesHumaninterfacedeviceNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DirectInput8Create(hinst: HINSTANCE, dwversion: UInt, riidltf: Long, ppvout: Long, punkouter: Long): HRESULT =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create(hinst.toString(), dwversion.toInt(), riidltf.toString(), ppvout.toString(), punkouter.toString()) as Int) else 0

public actual fun HidD_FlushQueue(hiddeviceobject: HANDLE): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue(hiddeviceobject.toString()) as Boolean) else false

public actual fun HidD_FreePreparsedData(preparseddata: PHIDP_PREPARSED_DATA): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData(preparseddata.toString()) as Boolean) else false

public actual fun HidD_GetAttributes(hiddeviceobject: HANDLE, attributes: Long): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes(hiddeviceobject.toString(), attributes.toString()) as Boolean) else false

public actual fun HidD_GetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration(hiddeviceobject.toString(), configuration.toString(), configurationlength.toInt()) as Boolean) else false

public actual fun HidD_GetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature(hiddeviceobject.toString(), reportbuffer.toString(), reportbufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetHidGuid(hidguid: Long) {
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) {
        _windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid(hidguid.toString())
    }
}

public actual fun HidD_GetIndexedString(hiddeviceobject: HANDLE, stringindex: UInt, buffer: Long, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString(hiddeviceobject.toString(), stringindex.toInt(), buffer.toString(), bufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetInputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport(hiddeviceobject.toString(), reportbuffer.toString(), reportbufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetManufacturerString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString(hiddeviceobject.toString(), buffer.toString(), bufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetMsGenreDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor(hiddeviceobject.toString(), buffer.toString(), bufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: Long): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers(hiddeviceobject.toString(), numberbuffers.toString()) as Boolean) else false

public actual fun HidD_GetPhysicalDescriptor(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor(hiddeviceobject.toString(), buffer.toString(), bufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetPreparsedData(hiddeviceobject: HANDLE, preparseddata: Long): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData(hiddeviceobject.toString(), preparseddata.toString()) as Boolean) else false

public actual fun HidD_GetProductString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString(hiddeviceobject.toString(), buffer.toString(), bufferlength.toInt()) as Boolean) else false

public actual fun HidD_GetSerialNumberString(hiddeviceobject: HANDLE, buffer: Long, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString(hiddeviceobject.toString(), buffer.toString(), bufferlength.toInt()) as Boolean) else false

public actual fun HidD_SetConfiguration(hiddeviceobject: HANDLE, configuration: Long, configurationlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration(hiddeviceobject.toString(), configuration.toString(), configurationlength.toInt()) as Boolean) else false

public actual fun HidD_SetFeature(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature(hiddeviceobject.toString(), reportbuffer.toString(), reportbufferlength.toInt()) as Boolean) else false

public actual fun HidD_SetNumInputBuffers(hiddeviceobject: HANDLE, numberbuffers: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers(hiddeviceobject.toString(), numberbuffers.toInt()) as Boolean) else false

public actual fun HidD_SetOutputReport(hiddeviceobject: HANDLE, reportbuffer: Long, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport(hiddeviceobject.toString(), reportbuffer.toString(), reportbufferlength.toInt()) as Boolean) else false

public actual fun HidP_GetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttondata.toString(), buttondatalength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetButtonCaps(reporttype: HIDP_REPORT_TYPE, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps(reporttype, buttoncaps.toString(), buttoncapslength.toString(), preparseddata.toString()) as Int) else 0

public actual fun HidP_GetCaps(preparseddata: PHIDP_PREPARSED_DATA, capabilities: Long): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps(preparseddata.toString(), capabilities.toString()) as Int) else 0

public actual fun HidP_GetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData(reporttype, datalist.toString(), datalength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetExtendedAttributes(reporttype: HIDP_REPORT_TYPE, dataindex: UShort, preparseddata: PHIDP_PREPARSED_DATA, attributes: Long, lengthattributes: Long): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes(reporttype, dataindex.toInt(), preparseddata.toString(), attributes.toString(), lengthattributes.toString()) as Int) else 0

public actual fun HidP_GetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes(linkcollectionnodes.toString(), linkcollectionnodeslength.toString(), preparseddata.toString()) as Int) else 0

public actual fun HidP_GetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetSpecificButtonCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: Long, buttoncapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttoncaps.toString(), buttoncapslength.toString(), preparseddata.toString()) as Int) else 0

public actual fun HidP_GetSpecificValueCaps(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), valuecaps.toString(), valuecapslength.toString(), preparseddata.toString()) as Int) else 0

public actual fun HidP_GetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toString(), usagevaluebytelength.toInt(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.toString(), usagelength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetUsagesEx(reporttype: HIDP_REPORT_TYPE, linkcollection: UShort, buttonlist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx(reporttype, linkcollection.toInt(), buttonlist.toString(), usagelength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_GetValueCaps(reporttype: HIDP_REPORT_TYPE, valuecaps: Long, valuecapslength: Long, preparseddata: PHIDP_PREPARSED_DATA): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps(reporttype, valuecaps.toString(), valuecapslength.toString(), preparseddata.toString()) as Int) else 0

public actual fun HidP_InitializeReportForID(reporttype: HIDP_REPORT_TYPE, reportid: UByte, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID(reporttype, reportid.toInt(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_MaxDataListLength(reporttype: HIDP_REPORT_TYPE, preparseddata: PHIDP_PREPARSED_DATA): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength(reporttype, preparseddata.toString()) as Int).toUInt() else 0u

public actual fun HidP_MaxUsageListLength(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, preparseddata: PHIDP_PREPARSED_DATA): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength(reporttype, usagepage.toInt(), preparseddata.toString()) as Int).toUInt() else 0u

public actual fun HidP_SetButtonArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: Long, buttondatalength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttondata.toString(), buttondatalength.toInt(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_SetData(reporttype: HIDP_REPORT_TYPE, datalist: Long, datalength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData(reporttype, datalist.toString(), datalength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_SetScaledUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue, preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_SetUsageValue(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toInt(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_SetUsageValueArray(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: PCSTR, usagevaluebytelength: UShort, preparseddata: PHIDP_PREPARSED_DATA, report: PSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toString(), usagevaluebytelength.toInt(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_SetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.toString(), usagelength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_TranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: UInt, keyaction: HIDP_KEYBOARD_DIRECTION, modifierstate: Long, insertcodesprocedure: PHIDP_INSERT_SCANCODES, insertcodescontext: Long): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes(changedusagelist.toString(), usagelistlength.toInt(), keyaction, modifierstate.toString(), insertcodesprocedure.toLong().toString(), insertcodescontext.toString()) as Int) else 0

public actual fun HidP_UnsetUsages(reporttype: HIDP_REPORT_TYPE, usagepage: UShort, linkcollection: UShort, usagelist: Long, usagelength: Long, preparseddata: PHIDP_PREPARSED_DATA, report: PCSTR, reportlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.toString(), usagelength.toString(), preparseddata.toString(), report.toString(), reportlength.toInt()) as Int) else 0

public actual fun HidP_UsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: UInt): NTSTATUS =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference(previoususagelist.toString(), currentusagelist.toString(), breakusagelist.toString(), makeusagelist.toString(), usagelistlength.toInt()) as Int) else 0

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAddon != null) (_windowsWin32DevicesHumaninterfacedeviceNapiAddon.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags.toInt()) as Int).toUInt() else 0u
