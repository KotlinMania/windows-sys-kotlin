@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWin32DevicesSensorsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: Int, sourcebuffer: Long, targetcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListMarshall(target: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: Int, targetbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer(collection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_GetPerformanceTime(timems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray(members: Long, size: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat(fltval: Float, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_IsCollectionListSame(lista: Long, listb: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_IsGUIDPresentInList(guidarray: Long, arraylength: Int, guidelem: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropertiesListCopy(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_SensorCollectionGetAt(index: Int, psensorslist: Long, pkey: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_SerializationBufferAllocate(sizeinbytes: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_sensors_SerializationBufferFree(buffer: Long)
}

public actual fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize(sourcecollection, ptargetbuffersizeinbytes, ptargetbuffer)

public actual fun CollectionsListCopyAndMarshall(target: Long, source: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall(target, source)

public actual fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer, targetcollection)

public actual fun CollectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun CollectionsListGetMarshalledSize(collection: Long): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize(collection).toUInt()

public actual fun CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization(collection).toUInt()

public actual fun CollectionsListGetSerializedSize(collection: Long): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize(collection).toUInt()

public actual fun CollectionsListMarshall(target: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListMarshall(target)

public actual fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer(sourcecollection, targetbuffersizeinbytes.toInt(), targetbuffer)

public actual fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence(thresholds, pcollection)

public actual fun CollectionsListUpdateMarshalledPointer(collection: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer(collection)

public actual fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds(newsample, oldsample, thresholds)

public actual fun GetPerformanceTime(timems: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_GetPerformanceTime(timems)

public actual fun InitPropVariantFromCLSIDArray(members: Long, size: UInt, ppropvar: Long): HRESULT =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray(members, size.toInt(), ppropvar)

public actual fun InitPropVariantFromFloat(fltval: Float, ppropvar: Long): HRESULT =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat(fltval, ppropvar)

public actual fun IsCollectionListSame(lista: Long, listb: Long): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_IsCollectionListSame(lista, listb)

public actual fun IsGUIDPresentInList(guidarray: Long, arraylength: UInt, guidelem: Long): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_IsGUIDPresentInList(guidarray, arraylength.toInt(), guidelem)

public actual fun IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList(plist, pkey)

public actual fun IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList(plist, pkey)

public actual fun IsSensorSubscribed(subscriptionlist: Long, currenttype: GUID): Boolean =
    false

public actual fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64(plist, pkey, occurrence.toInt(), pretvalue)

public actual fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong(plist, pkey, occurrence.toInt(), pretvalue)

public actual fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort(plist, pkey, occurrence.toInt(), pretvalue)

public actual fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant(plist, pkey, typecheck, pvalue)

public actual fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong(plist, pkey, pretvalue)

public actual fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort(plist, pkey, pretvalue)

public actual fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant(plist, pkey, typecheck, pvalue)

public actual fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropVariantGetInformation(propvariantvalue, propvariantoffset, propvariantsize, propvariantpointer, remappedtype)

public actual fun PropertiesListCopy(target: Long, source: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropertiesListCopy(target, source)

public actual fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_SensorCollectionGetAt(index.toInt(), psensorslist, pkey, pvalue)

public actual fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): NTSTATUS =
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_SerializationBufferAllocate(sizeinbytes.toInt(), pbuffer)

public actual fun SerializationBufferFree(buffer: Long) {
    WindowsWin32DevicesSensorsJniBridge.windowssys_windows_win32_devices_sensors_SerializationBufferFree(buffer)
}
