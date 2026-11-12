@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference
import io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice.cinterop.windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr, ppvout: MutPtr, punkouter: MutPtr): Hresult =
    windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(hinst.rawAddress.toCPointer<ByteVar>(), dwversion, riidltf.rawAddress.toCPointer<ByteVar>(), ppvout.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>())

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(hiddeviceobject.rawAddress.toCPointer<ByteVar>())

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata)

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), attributes.rawAddress.toCPointer<ByteVar>())

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr, configurationlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), configuration.rawAddress.toCPointer<ByteVar>(), configurationlength)

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), reportbuffer.rawAddress.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidDGetHidGuid(hidguid: MutPtr) {
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(hidguid.rawAddress.toCPointer<ByteVar>())
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr, bufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), stringindex, buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), reportbuffer.rawAddress.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), numberbuffers.rawAddress.toCPointer<ByteVar>())

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), preparseddata.rawAddress.toCPointer<ByteVar>())

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr, configurationlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), configuration.rawAddress.toCPointer<ByteVar>(), configurationlength)

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), reportbuffer.rawAddress.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), numberbuffers)

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(hiddeviceobject.rawAddress.toCPointer<ByteVar>(), reportbuffer.rawAddress.toCPointer<ByteVar>(), reportbufferlength)

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr, buttondatalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(reporttype, usagepage, linkcollection, usage, buttondata.rawAddress.toCPointer<ByteVar>(), buttondatalength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(reporttype, buttoncaps.rawAddress.toCPointer<ByteVar>(), buttoncapslength.rawAddress.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(preparseddata, capabilities.rawAddress.toCPointer<ByteVar>())

public actual fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(reporttype, datalist.rawAddress.toCPointer<ByteVar>(), datalength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr, lengthattributes: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(reporttype, dataindex, preparseddata, attributes.rawAddress.toCPointer<ByteVar>(), lengthattributes.rawAddress.toCPointer<ByteVar>())

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr, linkcollectionnodeslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(linkcollectionnodes.rawAddress.toCPointer<ByteVar>(), linkcollectionnodeslength.rawAddress.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(reporttype, usagepage, linkcollection, usage, buttoncaps.rawAddress.toCPointer<ByteVar>(), buttoncapslength.rawAddress.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(reporttype, usagepage, linkcollection, usage, valuecaps.rawAddress.toCPointer<ByteVar>(), valuecapslength.rawAddress.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(reporttype, usagepage, linkcollection, usage, usagevalue.rawAddress.toCPointer<ByteVar>(), usagevaluebytelength, preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(reporttype, usagepage, linkcollection, usagelist.rawAddress.toCPointer<ByteVar>(), usagelength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(reporttype, linkcollection, buttonlist.rawAddress.toCPointer<ByteVar>(), usagelength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(reporttype, valuecaps.rawAddress.toCPointer<ByteVar>(), valuecapslength.rawAddress.toCPointer<ByteVar>(), preparseddata)

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(reporttype, reportid, preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype, preparseddata)

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype, usagepage, preparseddata)

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(reporttype, usagepage, linkcollection, usage, buttondata.rawAddress.toCPointer<ByteVar>(), buttondatalength, preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(reporttype, datalist.rawAddress.toCPointer<ByteVar>(), datalength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(reporttype, usagepage, linkcollection, usage, usagevalue.rawAddress.toCPointer<ByteVar>(), usagevaluebytelength, preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(reporttype, usagepage, linkcollection, usagelist.rawAddress.toCPointer<ByteVar>(), usagelength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(changedusagelist.rawAddress.toCPointer<ByteVar>(), usagelistlength, keyaction, modifierstate.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), insertcodescontext.rawAddress.toCPointer<ByteVar>())

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(reporttype, usagepage, linkcollection, usagelist.rawAddress.toCPointer<ByteVar>(), usagelength.rawAddress.toCPointer<ByteVar>(), preparseddata, report.rawAddress.toCPointer<ByteVar>(), reportlength)

public actual fun hidPUsageListDifference(previoususagelist: ConstPtr, currentusagelist: ConstPtr, breakusagelist: MutPtr, makeusagelist: MutPtr, usagelistlength: UInt): Ntstatus =
    windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(previoususagelist.rawAddress.toCPointer<ByteVar>(), currentusagelist.rawAddress.toCPointer<ByteVar>(), breakusagelist.rawAddress.toCPointer<ByteVar>(), makeusagelist.rawAddress.toCPointer<ByteVar>(), usagelistlength)

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags)
