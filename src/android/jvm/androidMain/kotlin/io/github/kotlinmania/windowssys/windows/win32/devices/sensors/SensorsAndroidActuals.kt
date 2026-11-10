@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32DevicesSensorsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: Int, sourcebuffer: Long, targetcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListMarshall(target: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: Int, targetbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_evaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_getPerformanceTime(timems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray(members: Long, size: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(fltval: Float, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_isCollectionListSame(lista: Long, listb: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_isGUIDPresentInList(guidarray: Long, arraylength: Int, guidelem: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propertiesListCopy(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(index: Int, psensorslist: Long, pkey: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_serializationBufferAllocate(sizeinbytes: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_serializationBufferFree(buffer: Long)
}

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: COpaquePointer?, ptargetbuffersizeinbytes: COpaquePointer?, ptargetbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize((sourcecollection?.value ?: 0L), (ptargetbuffersizeinbytes?.value ?: 0L), (ptargetbuffer?.value ?: 0L))

public actual fun collectionsListCopyAndMarshall(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall((target?.value ?: 0L), (source?.value ?: 0L))

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: COpaquePointer?, targetcollection: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), (sourcebuffer?.value ?: 0L), (targetcollection?.value ?: 0L))

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun collectionsListGetMarshalledSize(collection: COpaquePointer?): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize((collection?.value ?: 0L)).toUInt()

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: COpaquePointer?): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization((collection?.value ?: 0L)).toUInt()

public actual fun collectionsListGetSerializedSize(collection: COpaquePointer?): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize((collection?.value ?: 0L)).toUInt()

public actual fun collectionsListMarshall(target: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListMarshall((target?.value ?: 0L))

public actual fun collectionsListSerializeToBuffer(sourcecollection: COpaquePointer?, targetbuffersizeinbytes: UInt, targetbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer((sourcecollection?.value ?: 0L), targetbuffersizeinbytes.toInt(), (targetbuffer?.value ?: 0L))

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: COpaquePointer?, pcollection: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence((thresholds?.value ?: 0L), (pcollection?.value ?: 0L))

public actual fun collectionsListUpdateMarshalledPointer(collection: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer((collection?.value ?: 0L))

public actual fun evaluateActivityThresholds(newsample: COpaquePointer?, oldsample: COpaquePointer?, thresholds: COpaquePointer?): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_evaluateActivityThresholds((newsample?.value ?: 0L), (oldsample?.value ?: 0L), (thresholds?.value ?: 0L))

public actual fun getPerformanceTime(timems: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_getPerformanceTime((timems?.value ?: 0L))

public actual fun initPropVariantFromCLSIDArray(members: COpaquePointer?, size: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray((members?.value ?: 0L), size.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(fltval, (ppropvar?.value ?: 0L))

public actual fun isCollectionListSame(lista: COpaquePointer?, listb: COpaquePointer?): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_isCollectionListSame((lista?.value ?: 0L), (listb?.value ?: 0L))

public actual fun isGUIDPresentInList(guidarray: COpaquePointer?, arraylength: UInt, guidelem: COpaquePointer?): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_isGUIDPresentInList((guidarray?.value ?: 0L), arraylength.toInt(), (guidelem?.value ?: 0L))

public actual fun isKeyPresentInCollectionList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList((plist?.value ?: 0L), (pkey?.value ?: 0L))

public actual fun isKeyPresentInPropertyList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList((plist?.value ?: 0L), (pkey?.value ?: 0L))

public actual fun isSensorSubscribed(subscriptionlist: COpaquePointer?, currenttype: Guid): Boolean =
    false

public actual fun propKeyFindKeyGetBool(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetDouble(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetFileTime(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetFloat(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetGuid(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetInt32(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetInt64(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetNthInt64(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64((plist?.value ?: 0L), (pkey?.value ?: 0L), occurrence.toInt(), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetNthUlong(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong((plist?.value ?: 0L), (pkey?.value ?: 0L), occurrence.toInt(), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetNthUshort(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort((plist?.value ?: 0L), (pkey?.value ?: 0L), occurrence.toInt(), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant((plist?.value ?: 0L), (pkey?.value ?: 0L), typecheck, (pvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetUlong(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeyGetUshort(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort((plist?.value ?: 0L), (pkey?.value ?: 0L), (pretvalue?.value ?: 0L))

public actual fun propKeyFindKeySetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant((plist?.value ?: 0L), (pkey?.value ?: 0L), typecheck, (pvalue?.value ?: 0L))

public actual fun propVariantGetInformation(propvariantvalue: COpaquePointer?, propvariantoffset: COpaquePointer?, propvariantsize: COpaquePointer?, propvariantpointer: COpaquePointer?, remappedtype: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propVariantGetInformation((propvariantvalue?.value ?: 0L), (propvariantoffset?.value ?: 0L), (propvariantsize?.value ?: 0L), (propvariantpointer?.value ?: 0L), (remappedtype?.value ?: 0L))

public actual fun propertiesListCopy(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propertiesListCopy((target?.value ?: 0L), (source?.value ?: 0L))

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: COpaquePointer?, pkey: COpaquePointer?, pvalue: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(index.toInt(), (psensorslist?.value ?: 0L), (pkey?.value ?: 0L), (pvalue?.value ?: 0L))

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_serializationBufferAllocate(sizeinbytes.toInt(), (pbuffer?.value ?: 0L))

public actual fun serializationBufferFree(buffer: COpaquePointer?) {
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_serializationBufferFree((buffer?.value ?: 0L))
}
