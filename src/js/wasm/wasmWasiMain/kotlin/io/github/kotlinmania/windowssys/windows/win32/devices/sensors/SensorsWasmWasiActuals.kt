@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr, ptargetbuffersizeinbytes: MutPtr, ptargetbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize")

public actual fun collectionsListCopyAndMarshall(target: MutPtr, source: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr, targetcollection: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount")
private external fun wasiWindowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes: Int): Int

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization")

public actual fun collectionsListGetSerializedSize(collection: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize")

public actual fun collectionsListMarshall(target: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListMarshall")

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr, pcollection: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence")

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer")

public actual fun evaluateActivityThresholds(newsample: ConstPtr, oldsample: ConstPtr, thresholds: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds")

public actual fun getPerformanceTime(timems: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsGetPerformanceTime")

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr, size: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat")

public actual fun isCollectionListSame(lista: ConstPtr, listb: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsCollectionListSame")

public actual fun isGUIDPresentInList(guidarray: ConstPtr, arraylength: UInt, guidelem: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList")

public actual fun isKeyPresentInCollectionList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList")

public actual fun isKeyPresentInPropertyList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList")

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsSensorSubscribed")

public actual fun propKeyFindKeyGetBool(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool")

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble")

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime")

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat")

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid")

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32")

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64")

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64")

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong")

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort")

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant")

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong")

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort")

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant")

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr, propvariantoffset: MutPtr, propvariantsize: MutPtr, propvariantpointer: MutPtr, remappedtype: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropVariantGetInformation")

public actual fun propertiesListCopy(target: MutPtr, source: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropertiesListCopy")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount")
private external fun wasiWindowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes: Int): Int

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr, pkey: MutPtr, pvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate")

public actual fun serializationBufferFree(buffer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsSerializationBufferFree")
