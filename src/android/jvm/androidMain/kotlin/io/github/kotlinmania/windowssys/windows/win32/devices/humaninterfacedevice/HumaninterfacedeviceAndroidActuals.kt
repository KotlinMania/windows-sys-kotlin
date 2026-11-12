@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32DevicesHumaninterfacedeviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(hinst: Long, dwversion: Int, riidltf: Long, ppvout: Long, punkouter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(hiddeviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(hiddeviceobject: Long, attributes: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(hiddeviceobject: Long, configuration: Long, configurationlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(hidguid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(hiddeviceobject: Long, stringindex: Int, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(hiddeviceobject: Long, numberbuffers: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(hiddeviceobject: Long, preparseddata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(hiddeviceobject: Long, buffer: Long, bufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(hiddeviceobject: Long, configuration: Long, configurationlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(hiddeviceobject: Long, numberbuffers: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(hiddeviceobject: Long, reportbuffer: Long, reportbufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttondata: Long, buttondatalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(reporttype: Int, buttoncaps: Long, buttoncapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(preparseddata: Long, capabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(reporttype: Int, datalist: Long, datalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(reporttype: Int, dataindex: Short, preparseddata: Long, attributes: Long, lengthattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(linkcollectionnodes: Long, linkcollectionnodeslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttoncaps: Long, buttoncapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, valuecaps: Long, valuecapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, usagevaluebytelength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(reporttype: Int, linkcollection: Short, buttonlist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(reporttype: Int, valuecaps: Long, valuecapslength: Long, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(reporttype: Int, reportid: Byte, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype: Int, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype: Int, usagepage: Short, preparseddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, buttondata: Long, buttondatalength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(reporttype: Int, datalist: Long, datalength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Int, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Int, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(reporttype: Int, usagepage: Short, linkcollection: Short, usage: Short, usagevalue: Long, usagevaluebytelength: Short, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(changedusagelist: Long, usagelistlength: Int, keyaction: Int, modifierstate: Long, insertcodesprocedure: Long, insertcodescontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(reporttype: Int, usagepage: Short, linkcollection: Short, usagelist: Long, usagelength: Long, preparseddata: Long, report: Long, reportlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(previoususagelist: Long, currentusagelist: Long, breakusagelist: Long, makeusagelist: Long, usagelistlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags: Int): Int
}

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr, ppvout: MutPtr, punkouter: MutPtr): Hresult =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(hinst.rawAddress, dwversion.toInt(), riidltf.rawAddress, ppvout.rawAddress, punkouter.rawAddress)

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(hiddeviceobject.rawAddress)

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata)

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(hiddeviceobject.rawAddress, attributes.rawAddress)

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr, configurationlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(hiddeviceobject.rawAddress, configuration.rawAddress, configurationlength.toInt())

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(hiddeviceobject.rawAddress, reportbuffer.rawAddress, reportbufferlength.toInt())

public actual fun hidDGetHidGuid(hidguid: MutPtr) {
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(hidguid.rawAddress)
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(hiddeviceobject.rawAddress, stringindex.toInt(), buffer.rawAddress, bufferlength.toInt())

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(hiddeviceobject.rawAddress, reportbuffer.rawAddress, reportbufferlength.toInt())

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(hiddeviceobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(hiddeviceobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(hiddeviceobject.rawAddress, numberbuffers.rawAddress)

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(hiddeviceobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(hiddeviceobject.rawAddress, preparseddata.rawAddress)

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(hiddeviceobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(hiddeviceobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr, configurationlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(hiddeviceobject.rawAddress, configuration.rawAddress, configurationlength.toInt())

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(hiddeviceobject.rawAddress, reportbuffer.rawAddress, reportbufferlength.toInt())

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(hiddeviceobject.rawAddress, numberbuffers.toInt())

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(hiddeviceobject.rawAddress, reportbuffer.rawAddress, reportbufferlength.toInt())

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr, buttondatalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), buttondata.rawAddress, buttondatalength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(reporttype, buttoncaps.rawAddress, buttoncapslength.rawAddress, preparseddata)

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(preparseddata, capabilities.rawAddress)

public actual fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(reporttype, datalist.rawAddress, datalength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr, lengthattributes: MutPtr): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(reporttype, dataindex.toShort(), preparseddata, attributes.rawAddress, lengthattributes.rawAddress)

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr, linkcollectionnodeslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(linkcollectionnodes.rawAddress, linkcollectionnodeslength.rawAddress, preparseddata)

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), buttoncaps.rawAddress, buttoncapslength.rawAddress, preparseddata)

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), valuecaps.rawAddress, valuecapslength.rawAddress, preparseddata)

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.rawAddress, usagevaluebytelength.toShort(), preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), usagelist.rawAddress, usagelength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(reporttype, linkcollection.toShort(), buttonlist.rawAddress, usagelength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(reporttype, valuecaps.rawAddress, valuecapslength.rawAddress, preparseddata)

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(reporttype, reportid.toByte(), preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype, preparseddata).toUInt()

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype, usagepage.toShort(), preparseddata).toUInt()

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), buttondata.rawAddress, buttondatalength.toShort(), preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(reporttype, datalist.rawAddress, datalength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.toInt(), preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(reporttype, usagepage.toShort(), linkcollection.toShort(), usage.toShort(), usagevalue.rawAddress, usagevaluebytelength.toShort(), preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), usagelist.rawAddress, usagelength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(changedusagelist.rawAddress, usagelistlength.toInt(), keyaction, modifierstate.rawAddress, 0L, insertcodescontext.rawAddress)

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(reporttype, usagepage.toShort(), linkcollection.toShort(), usagelist.rawAddress, usagelength.rawAddress, preparseddata, report.rawAddress, reportlength.toInt())

public actual fun hidPUsageListDifference(previoususagelist: ConstPtr, currentusagelist: ConstPtr, breakusagelist: MutPtr, makeusagelist: MutPtr, usagelistlength: UInt): Ntstatus =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(previoususagelist.rawAddress, currentusagelist.rawAddress, breakusagelist.rawAddress, makeusagelist.rawAddress, usagelistlength.toInt())

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    WindowsWin32DevicesHumaninterfacedeviceJniBridge.windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags.toInt()).toUInt()
