package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr, ppvout: MutPtr, punkouter: MutPtr): Hresult

public expect fun hidDFlushQueue(hiddeviceobject: Handle): Boolean

public expect fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean

public expect fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr): Boolean

public expect fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr, configurationlength: UInt): Boolean

public expect fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean

public expect fun hidDGetHidGuid(hidguid: MutPtr)

public expect fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr, bufferlength: UInt): Boolean

public expect fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean

public expect fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean

public expect fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean

public expect fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr): Boolean

public expect fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean

public expect fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr): Boolean

public expect fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean

public expect fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean

public expect fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr, configurationlength: UInt): Boolean

public expect fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean

public expect fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean

public expect fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean

public expect fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr, buttondatalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr): Ntstatus

public expect fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr, lengthattributes: MutPtr): Ntstatus

public expect fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr, linkcollectionnodeslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus

public expect fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt

public expect fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt

public expect fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus

public expect fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr): Ntstatus

public expect fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus

public expect fun hidPUsageListDifference(previoususagelist: ConstPtr, currentusagelist: ConstPtr, breakusagelist: MutPtr, makeusagelist: MutPtr, usagelistlength: UInt): Ntstatus

public expect fun joyConfigChanged(dwflags: UInt): UInt
