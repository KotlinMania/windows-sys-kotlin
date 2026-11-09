@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize(sourcecollection.toCPointer<ByteVar>(), ptargetbuffersizeinbytes.toCPointer<ByteVar>(), ptargetbuffer.toCPointer<ByteVar>())

public actual fun CollectionsListCopyAndMarshall(target: Long, source: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall(target.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())

public actual fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes, sourcebuffer.toCPointer<ByteVar>(), targetcollection.toCPointer<ByteVar>())

public actual fun CollectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount(buffersizebytes)

public actual fun CollectionsListGetMarshalledSize(collection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize(collection.toCPointer<ByteVar>())

public actual fun CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization(collection.toCPointer<ByteVar>())

public actual fun CollectionsListGetSerializedSize(collection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize(collection.toCPointer<ByteVar>())

public actual fun CollectionsListMarshall(target: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListMarshall(target.toCPointer<ByteVar>())

public actual fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer(sourcecollection.toCPointer<ByteVar>(), targetbuffersizeinbytes, targetbuffer.toCPointer<ByteVar>())

public actual fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence(thresholds.toCPointer<ByteVar>(), pcollection.toCPointer<ByteVar>())

public actual fun CollectionsListUpdateMarshalledPointer(collection: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer(collection.toCPointer<ByteVar>())

public actual fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds(newsample.toCPointer<ByteVar>(), oldsample.toCPointer<ByteVar>(), thresholds.toCPointer<ByteVar>())

public actual fun GetPerformanceTime(timems: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_GetPerformanceTime(timems.toCPointer<ByteVar>())

public actual fun InitPropVariantFromCLSIDArray(members: Long, size: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray(members.toCPointer<ByteVar>(), size, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromFloat(fltval: Float, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat(fltval, ppropvar.toCPointer<ByteVar>())

public actual fun IsCollectionListSame(lista: Long, listb: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_IsCollectionListSame(lista.toCPointer<ByteVar>(), listb.toCPointer<ByteVar>())

public actual fun IsGUIDPresentInList(guidarray: Long, arraylength: UInt, guidelem: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_IsGUIDPresentInList(guidarray.toCPointer<ByteVar>(), arraylength, guidelem.toCPointer<ByteVar>())

public actual fun IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>())

public actual fun IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>())

public actual fun IsSensorSubscribed(subscriptionlist: Long, currenttype: GUID): Boolean =
    false

public actual fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), occurrence, pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), occurrence, pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), occurrence, pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), typecheck, pvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pretvalue.toCPointer<ByteVar>())

public actual fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant(plist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), typecheck, pvalue.toCPointer<ByteVar>())

public actual fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropVariantGetInformation(propvariantvalue.toCPointer<ByteVar>(), propvariantoffset.toCPointer<ByteVar>(), propvariantsize.toCPointer<ByteVar>(), propvariantpointer.toCPointer<ByteVar>(), remappedtype.toCPointer<ByteVar>())

public actual fun PropertiesListCopy(target: Long, source: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropertiesListCopy(target.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())

public actual fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount(buffersizebytes)

public actual fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_SensorCollectionGetAt(index, psensorslist.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>())

public actual fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_SerializationBufferAllocate(sizeinbytes, pbuffer.toCPointer<ByteVar>())

public actual fun SerializationBufferFree(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_SerializationBufferFree(buffer.toCPointer<ByteVar>())
}
