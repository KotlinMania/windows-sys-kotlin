@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr, ppvout: MutPtr, punkouter: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create")

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData")
private external fun wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata: Long): Int

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    (wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata) != 0)

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes")

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr, configurationlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration")

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature")

public actual fun hidDGetHidGuid(hidguid: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid")

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr, bufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString")

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport")

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString")

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor")

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers")

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor")

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData")

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString")

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString")

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr, configurationlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration")

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature")

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers")

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport")

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr, buttondatalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray")

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps")

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps")

public actual fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData")

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr, lengthattributes: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes")

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr, linkcollectionnodeslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes")

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue")

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps")

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps")

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue")

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray")

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages")

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx")

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps")

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength")
private external fun wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype: Int, preparseddata: Long): Int

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype, preparseddata).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength")
private external fun wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype: Int, usagepage: Int, preparseddata: Long): Int

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype, usagepage.toInt(), preparseddata).toUInt()

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray")

public actual fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData")

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue")

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue")

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray")

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages")

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes")

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages")

public actual fun hidPUsageListDifference(previoususagelist: ConstPtr, currentusagelist: ConstPtr, breakusagelist: MutPtr, makeusagelist: MutPtr, usagelistlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged")
private external fun wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags: Int): Int

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags.toInt()).toUInt()
