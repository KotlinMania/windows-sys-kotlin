@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr<SensorCollectionList>, ptargetbuffersizeinbytes: MutPtr<UInt>, ptargetbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize")

public actual fun collectionsListCopyAndMarshall(target: MutPtr<SensorCollectionList>, source: ConstPtr<SensorCollectionList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr<UByte>, targetcollection: MutPtr<SensorCollectionList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount")
private external fun wasiWindowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes: Int): Int

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr<SensorCollectionList>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr<SensorCollectionList>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization")

public actual fun collectionsListGetSerializedSize(collection: ConstPtr<SensorCollectionList>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize")

public actual fun collectionsListMarshall(target: MutPtr<SensorCollectionList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListMarshall")

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr<SensorCollectionList>, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr<UByte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr<SensorCollectionList>, pcollection: MutPtr<SensorCollectionList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence")

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr<SensorCollectionList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer")

public actual fun evaluateActivityThresholds(newsample: ConstPtr<SensorCollectionList>, oldsample: ConstPtr<SensorCollectionList>, thresholds: ConstPtr<SensorCollectionList>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds")

public actual fun getPerformanceTime(timems: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsGetPerformanceTime")

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr<Guid>, size: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat")

public actual fun isCollectionListSame(lista: ConstPtr<SensorCollectionList>, listb: ConstPtr<SensorCollectionList>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsCollectionListSame")

public actual fun isGUIDPresentInList(guidarray: ConstPtr<Guid>, arraylength: UInt, guidelem: ConstPtr<Guid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList")

public actual fun isKeyPresentInCollectionList(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList")

public actual fun isKeyPresentInPropertyList(plist: ConstPtr<SensorPropertyList>, pkey: ConstPtr<Propertykey>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList")

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr<SensorCollectionList>, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsIsSensorSubscribed")

public actual fun propKeyFindKeyGetBool(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Bool>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool")

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Double>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble")

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Filetime>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime")

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Float>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat")

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid")

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32")

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64")

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64")

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong")

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UShort>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort")

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: MutPtr<Propvariant>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant")

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong")

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UShort>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort")

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: ConstPtr<Propvariant>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant")

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr<Propvariant>, propvariantoffset: MutPtr<UInt>, propvariantsize: MutPtr<UInt>, propvariantpointer: MutPtr<MutPtr<CVoid>>, remappedtype: MutPtr<Devproptype>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropVariantGetInformation")

public actual fun propertiesListCopy(target: MutPtr<SensorPropertyList>, source: ConstPtr<SensorPropertyList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsPropertiesListCopy")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount")
private external fun wasiWindowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes: Int): Int

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr<SensorCollectionList>, pkey: MutPtr<Propertykey>, pvalue: MutPtr<Propvariant>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate")

public actual fun serializationBufferFree(buffer: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSensorsSerializationBufferFree")
