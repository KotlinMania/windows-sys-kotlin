@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr, ptargetbuffersizeinbytes: MutPtr, ptargetbuffer: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress.toCPointer<ByteVar>(), ptargetbuffersizeinbytes.rawAddress.toCPointer<ByteVar>(), ptargetbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListCopyAndMarshall(target: MutPtr, source: ConstPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr, targetcollection: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes, sourcebuffer.rawAddress.toCPointer<ByteVar>(), targetcollection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes)

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListGetSerializedSize(collection: ConstPtr): UInt =
    windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListMarshall(target: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress.toCPointer<ByteVar>(), targetbuffersizeinbytes, targetbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr, pcollection: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress.toCPointer<ByteVar>(), pcollection.rawAddress.toCPointer<ByteVar>())

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress.toCPointer<ByteVar>())

public actual fun evaluateActivityThresholds(newsample: ConstPtr, oldsample: ConstPtr, thresholds: ConstPtr): Boolean =
    windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress.toCPointer<ByteVar>(), oldsample.rawAddress.toCPointer<ByteVar>(), thresholds.rawAddress.toCPointer<ByteVar>())

public actual fun getPerformanceTime(timems: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr, size: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress.toCPointer<ByteVar>(), size, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun isCollectionListSame(lista: ConstPtr, listb: ConstPtr): Boolean =
    windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress.toCPointer<ByteVar>(), listb.rawAddress.toCPointer<ByteVar>())

public actual fun isGUIDPresentInList(guidarray: ConstPtr, arraylength: UInt, guidelem: ConstPtr): Boolean =
    windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress.toCPointer<ByteVar>(), arraylength, guidelem.rawAddress.toCPointer<ByteVar>())

public actual fun isKeyPresentInCollectionList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>())

public actual fun isKeyPresentInPropertyList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>())

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr, currenttype: Guid): Boolean =
    false

public actual fun propKeyFindKeyGetBool(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), occurrence, pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), occurrence, pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), occurrence, pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), typecheck, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pretvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: ConstPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), typecheck, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr, propvariantoffset: MutPtr, propvariantsize: MutPtr, propvariantpointer: MutPtr, remappedtype: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress.toCPointer<ByteVar>(), propvariantoffset.rawAddress.toCPointer<ByteVar>(), propvariantsize.rawAddress.toCPointer<ByteVar>(), propvariantpointer.rawAddress.toCPointer<ByteVar>(), remappedtype.rawAddress.toCPointer<ByteVar>())

public actual fun propertiesListCopy(target: MutPtr, source: ConstPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes)

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr, pkey: MutPtr, pvalue: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index, psensorslist.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>(), pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr): Ntstatus =
    windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes, pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun serializationBufferFree(buffer: ConstPtr) {
    windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress.toCPointer<ByteVar>())
}
