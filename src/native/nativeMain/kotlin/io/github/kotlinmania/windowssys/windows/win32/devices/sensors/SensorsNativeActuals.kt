@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListMarshall
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsGetPerformanceTime
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsIsCollectionListSame
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropVariantGetInformation
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropertiesListCopy
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssysWindowsWin32DevicesSensorsSerializationBufferFree
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr<SensorCollectionList>, ptargetbuffersizeinbytes: MutPtr<UInt>, ptargetbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress.toCPointer<ByteVar>(), ptargetbuffersizeinbytes.rawAddress.toCPointer<ByteVar>(), ptargetbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListCopyAndMarshall(target: MutPtr<SensorCollectionList>, source: ConstPtr<SensorCollectionList>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr<UByte>, targetcollection: MutPtr<SensorCollectionList>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes, sourcebuffer.rawAddress.toCPointer<ByteVar>(), targetcollection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes)

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr<SensorCollectionList>): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr<SensorCollectionList>): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListGetSerializedSize(collection: ConstPtr<SensorCollectionList>): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListMarshall(target: MutPtr<SensorCollectionList>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr<SensorCollectionList>, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr<UByte>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress.toCPointer<ByteVar>(), targetbuffersizeinbytes, targetbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr<SensorCollectionList>, pcollection: MutPtr<SensorCollectionList>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress.toCPointer<ByteVar>(), pcollection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr<SensorCollectionList>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress.toCPointer<ByteVar>())

public actual fun evaluateActivityThresholds(newsample: ConstPtr<SensorCollectionList>, oldsample: ConstPtr<SensorCollectionList>, thresholds: ConstPtr<SensorCollectionList>): Boolean =
    windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress.toCPointer<ByteVar>(), oldsample.rawAddress.toCPointer<ByteVar>(), thresholds.rawAddress.toCPointer<ByteVar>())

public actual fun getPerformanceTime(timems: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr<Guid>, size: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress.toCPointer<ByteVar>(), size, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun isCollectionListSame(lista: ConstPtr<SensorCollectionList>, listb: ConstPtr<SensorCollectionList>): Boolean =
    windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress.toCPointer<ByteVar>(), listb.rawAddress.toCPointer<ByteVar>())

public actual fun isGUIDPresentInList(guidarray: ConstPtr<Guid>, arraylength: UInt, guidelem: ConstPtr<Guid>): Boolean =
    windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress.toCPointer<ByteVar>(), arraylength, guidelem.rawAddress.toCPointer<ByteVar>())

public actual fun isKeyPresentInCollectionList(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>): Boolean =
    windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>())

public actual fun isKeyPresentInPropertyList(plist: ConstPtr<SensorPropertyList>, pkey: ConstPtr<Propertykey>): Boolean =
    windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>())

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr<SensorCollectionList>, currenttype: Guid): Boolean =
    false

public actual fun propKeyFindKeyGetBool(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Bool>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Double>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Filetime>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Float>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Guid>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Int>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Long>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<Long>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), occurrence, pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), occurrence, pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UShort>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), occurrence, pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: MutPtr<Propvariant>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), typecheck, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UShort>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: ConstPtr<Propvariant>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), typecheck, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr<Propvariant>, propvariantoffset: MutPtr<UInt>, propvariantsize: MutPtr<UInt>, propvariantpointer: MutPtr<MutPtr<CVoid>>, remappedtype: MutPtr<Devproptype>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress.toCPointer<ByteVar>(), propvariantoffset.rawAddress.toCPointer<ByteVar>(), propvariantsize.rawAddress.toCPointer<ByteVar>(), propvariantpointer.rawAddress.toCPointer<ByteVar>(), remappedtype.rawAddress.toCPointer<ByteVar>())

public actual fun propertiesListCopy(target: MutPtr<SensorPropertyList>, source: ConstPtr<SensorPropertyList>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes)

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr<SensorCollectionList>, pkey: MutPtr<Propertykey>, pvalue: MutPtr<Propvariant>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index, psensorslist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes, pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun serializationBufferFree(buffer: ConstPtr<UByte>) {
    windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress.toCPointer<ByteVar>())
}
