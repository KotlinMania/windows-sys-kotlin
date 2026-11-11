@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListMarshall
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_evaluateActivityThresholds
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_getPerformanceTime
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_initPropVariantFromFloat
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_isCollectionListSame
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_isGUIDPresentInList
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propVariantGetInformation
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propertiesListCopy
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_sensorCollectionGetAt
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_serializationBufferAllocate
import io.github.kotlinmania.windowssys.windows.win32.devices.sensors.cinterop.windowssys_windows_win32_devices_sensors_serializationBufferFree
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: COpaquePointer?, ptargetbuffersizeinbytes: COpaquePointer?, ptargetbuffer: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize(sourcecollection?.value?.toCPointer<ByteVar>(), ptargetbuffersizeinbytes?.value?.toCPointer<ByteVar>(), ptargetbuffer?.value?.toCPointer<ByteVar>())

public actual fun collectionsListCopyAndMarshall(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall(target?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: COpaquePointer?, targetcollection: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes, sourcebuffer?.value?.toCPointer<ByteVar>(), targetcollection?.value?.toCPointer<ByteVar>())

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(buffersizebytes)

public actual fun collectionsListGetMarshalledSize(collection: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize(collection?.value?.toCPointer<ByteVar>())

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization(collection?.value?.toCPointer<ByteVar>())

public actual fun collectionsListGetSerializedSize(collection: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize(collection?.value?.toCPointer<ByteVar>())

public actual fun collectionsListMarshall(target: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListMarshall(target?.value?.toCPointer<ByteVar>())

public actual fun collectionsListSerializeToBuffer(sourcecollection: COpaquePointer?, targetbuffersizeinbytes: UInt, targetbuffer: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer(sourcecollection?.value?.toCPointer<ByteVar>(), targetbuffersizeinbytes, targetbuffer?.value?.toCPointer<ByteVar>())

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: COpaquePointer?, pcollection: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence(thresholds?.value?.toCPointer<ByteVar>(), pcollection?.value?.toCPointer<ByteVar>())

public actual fun collectionsListUpdateMarshalledPointer(collection: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer(collection?.value?.toCPointer<ByteVar>())

public actual fun evaluateActivityThresholds(newsample: COpaquePointer?, oldsample: COpaquePointer?, thresholds: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_sensors_evaluateActivityThresholds(newsample?.value?.toCPointer<ByteVar>(), oldsample?.value?.toCPointer<ByteVar>(), thresholds?.value?.toCPointer<ByteVar>())

public actual fun getPerformanceTime(timems: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_getPerformanceTime(timems?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromCLSIDArray(members: COpaquePointer?, size: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray(members?.value?.toCPointer<ByteVar>(), size, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(fltval, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun isCollectionListSame(lista: COpaquePointer?, listb: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_sensors_isCollectionListSame(lista?.value?.toCPointer<ByteVar>(), listb?.value?.toCPointer<ByteVar>())

public actual fun isGUIDPresentInList(guidarray: COpaquePointer?, arraylength: UInt, guidelem: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_sensors_isGUIDPresentInList(guidarray?.value?.toCPointer<ByteVar>(), arraylength, guidelem?.value?.toCPointer<ByteVar>())

public actual fun isKeyPresentInCollectionList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>())

public actual fun isKeyPresentInPropertyList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>())

public actual fun isSensorSubscribed(subscriptionlist: COpaquePointer?, currenttype: Guid): Boolean =
    false

public actual fun propKeyFindKeyGetBool(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetDouble(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetFileTime(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetFloat(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetGuid(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetInt32(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetInt64(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthInt64(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), occurrence, pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthUlong(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), occurrence, pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetNthUshort(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), occurrence, pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), typecheck, pvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetUlong(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeyGetUshort(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pretvalue?.value?.toCPointer<ByteVar>())

public actual fun propKeyFindKeySetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant(plist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), typecheck, pvalue?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetInformation(propvariantvalue: COpaquePointer?, propvariantoffset: COpaquePointer?, propvariantsize: COpaquePointer?, propvariantpointer: COpaquePointer?, remappedtype: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propVariantGetInformation(propvariantvalue?.value?.toCPointer<ByteVar>(), propvariantoffset?.value?.toCPointer<ByteVar>(), propvariantsize?.value?.toCPointer<ByteVar>(), propvariantpointer?.value?.toCPointer<ByteVar>(), remappedtype?.value?.toCPointer<ByteVar>())

public actual fun propertiesListCopy(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_propertiesListCopy(target?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(buffersizebytes)

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: COpaquePointer?, pkey: COpaquePointer?, pvalue: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(index, psensorslist?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>())

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_devices_sensors_serializationBufferAllocate(sizeinbytes, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun serializationBufferFree(buffer: COpaquePointer?) {
    windowssys_windows_win32_devices_sensors_serializationBufferFree(buffer?.value?.toCPointer<ByteVar>())
}
