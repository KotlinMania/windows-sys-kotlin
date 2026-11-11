@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: COpaquePointer?, ppvout: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create(hinst?.value?.toCPointer<ByteVar>(), dwversion, riidltf?.value?.toCPointer<ByteVar>(), ppvout?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>())

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue(hiddeviceobject?.value?.toCPointer<ByteVar>())

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(preparseddata)

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes(hiddeviceobject?.value?.toCPointer<ByteVar>(), attributes?.value?.toCPointer<ByteVar>())

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration(hiddeviceobject?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), configurationlength)

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature(hiddeviceobject?.value?.toCPointer<ByteVar>(), reportbuffer?.value?.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidDGetHidGuid(hidguid: COpaquePointer?) {
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid(hidguid?.value?.toCPointer<ByteVar>())
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString(hiddeviceobject?.value?.toCPointer<ByteVar>(), stringindex, buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport(hiddeviceobject?.value?.toCPointer<ByteVar>(), reportbuffer?.value?.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString(hiddeviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor(hiddeviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers(hiddeviceobject?.value?.toCPointer<ByteVar>(), numberbuffers?.value?.toCPointer<ByteVar>())

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor(hiddeviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData(hiddeviceobject?.value?.toCPointer<ByteVar>(), preparseddata?.value?.toCPointer<ByteVar>())

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString(hiddeviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString(hiddeviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration(hiddeviceobject?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), configurationlength)

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature(hiddeviceobject?.value?.toCPointer<ByteVar>(), reportbuffer?.value?.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers(hiddeviceobject?.value?.toCPointer<ByteVar>(), numberbuffers)

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport(hiddeviceobject?.value?.toCPointer<ByteVar>(), reportbuffer?.value?.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(reporttype, usagepage, linkcollection, usage, buttondata?.value?.toCPointer<ByteVar>(), buttondatalength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(reporttype, buttoncaps?.value?.toCPointer<ByteVar>(), buttoncapslength?.value?.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(preparseddata, capabilities?.value?.toCPointer<ByteVar>())

public actual fun hidPGetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(reporttype, datalist?.value?.toCPointer<ByteVar>(), datalength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: COpaquePointer?, lengthattributes: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(reporttype, dataindex, preparseddata, attributes?.value?.toCPointer<ByteVar>(), lengthattributes?.value?.toCPointer<ByteVar>())

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: COpaquePointer?, linkcollectionnodeslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes(linkcollectionnodes?.value?.toCPointer<ByteVar>(), linkcollectionnodeslength?.value?.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(reporttype, usagepage, linkcollection, usage, buttoncaps?.value?.toCPointer<ByteVar>(), buttoncapslength?.value?.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(reporttype, usagepage, linkcollection, usage, valuecaps?.value?.toCPointer<ByteVar>(), valuecapslength?.value?.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(reporttype, usagepage, linkcollection, usage, usagevalue?.value?.toCPointer<ByteVar>(), usagevaluebytelength, preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(reporttype, usagepage, linkcollection, usagelist?.value?.toCPointer<ByteVar>(), usagelength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(reporttype, linkcollection, buttonlist?.value?.toCPointer<ByteVar>(), usagelength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(reporttype, valuecaps?.value?.toCPointer<ByteVar>(), valuecapslength?.value?.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(reporttype, reportid, preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(reporttype, preparseddata)

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(reporttype, usagepage, preparseddata)

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(reporttype, usagepage, linkcollection, usage, buttondata?.value?.toCPointer<ByteVar>(), buttondatalength, preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(reporttype, datalist?.value?.toCPointer<ByteVar>(), datalength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(reporttype, usagepage, linkcollection, usage, usagevalue?.value?.toCPointer<ByteVar>(), usagevaluebytelength, preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(reporttype, usagepage, linkcollection, usagelist?.value?.toCPointer<ByteVar>(), usagelength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: COpaquePointer?, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: COpaquePointer?, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes(changedusagelist?.value?.toCPointer<ByteVar>(), usagelistlength, keyaction, modifierstate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), insertcodescontext?.value?.toCPointer<ByteVar>())

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(reporttype, usagepage, linkcollection, usagelist?.value?.toCPointer<ByteVar>(), usagelength?.value?.toCPointer<ByteVar>(), preparseddata, report?.value?.toCPointer<ByteVar>(), reportlength)

public actual fun hidPUsageListDifference(previoususagelist: COpaquePointer?, currentusagelist: COpaquePointer?, breakusagelist: COpaquePointer?, makeusagelist: COpaquePointer?, usagelistlength: UInt): Ntstatus =
    windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference(previoususagelist?.value?.toCPointer<ByteVar>(), currentusagelist?.value?.toCPointer<ByteVar>(), breakusagelist?.value?.toCPointer<ByteVar>(), makeusagelist?.value?.toCPointer<ByteVar>(), usagelistlength)

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags)
