@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32DevicesSensorsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: Int, sourcebuffer: Long, targetcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: Int, targetbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members: Long, size: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval: Float, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista: Long, listb: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray: Long, arraylength: Int, guidelem: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index: Int, psensorslist: Long, pkey: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer: Long)
}

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr<SensorCollectionList>, ptargetbuffersizeinbytes: MutPtr<UInt>, ptargetbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress, ptargetbuffersizeinbytes.rawAddress, ptargetbuffer.rawAddress)

public actual fun collectionsListCopyAndMarshall(target: MutPtr<SensorCollectionList>, source: ConstPtr<SensorCollectionList>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress, source.rawAddress)

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr<UByte>, targetcollection: MutPtr<SensorCollectionList>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer.rawAddress, targetcollection.rawAddress)

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr<SensorCollectionList>): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress).toUInt()

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr<SensorCollectionList>): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress).toUInt()

public actual fun collectionsListGetSerializedSize(collection: ConstPtr<SensorCollectionList>): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress).toUInt()

public actual fun collectionsListMarshall(target: MutPtr<SensorCollectionList>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress)

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr<SensorCollectionList>, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr<UByte>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress, targetbuffersizeinbytes.toInt(), targetbuffer.rawAddress)

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr<SensorCollectionList>, pcollection: MutPtr<SensorCollectionList>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress, pcollection.rawAddress)

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr<SensorCollectionList>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress)

public actual fun evaluateActivityThresholds(newsample: ConstPtr<SensorCollectionList>, oldsample: ConstPtr<SensorCollectionList>, thresholds: ConstPtr<SensorCollectionList>): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress, oldsample.rawAddress, thresholds.rawAddress)

public actual fun getPerformanceTime(timems: MutPtr<UInt>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress)

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr<Guid>, size: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress, size.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr<Propvariant>): Hresult =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval, ppropvar.rawAddress)

public actual fun isCollectionListSame(lista: ConstPtr<SensorCollectionList>, listb: ConstPtr<SensorCollectionList>): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress, listb.rawAddress)

public actual fun isGUIDPresentInList(guidarray: ConstPtr<Guid>, arraylength: UInt, guidelem: ConstPtr<Guid>): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress, arraylength.toInt(), guidelem.rawAddress)

public actual fun isKeyPresentInCollectionList(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress, pkey.rawAddress)

public actual fun isKeyPresentInPropertyList(plist: ConstPtr<SensorPropertyList>, pkey: ConstPtr<Propertykey>): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress, pkey.rawAddress)

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr<SensorCollectionList>, currenttype: Guid): Boolean =
    false

public actual fun propKeyFindKeyGetBool(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Bool>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Double>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Filetime>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Float>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Guid>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Int>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Long>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<Long>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress, pkey.rawAddress, occurrence.toInt(), pretvalue.rawAddress)

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UInt>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress, pkey.rawAddress, occurrence.toInt(), pretvalue.rawAddress)

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UShort>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress, pkey.rawAddress, occurrence.toInt(), pretvalue.rawAddress)

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: MutPtr<Propvariant>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress, pkey.rawAddress, typecheck, pvalue.rawAddress)

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UInt>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UShort>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: ConstPtr<Propvariant>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress, pkey.rawAddress, typecheck, pvalue.rawAddress)

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr<Propvariant>, propvariantoffset: MutPtr<UInt>, propvariantsize: MutPtr<UInt>, propvariantpointer: MutPtr<MutPtr<CVoid>>, remappedtype: MutPtr<Devproptype>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress, propvariantoffset.rawAddress, propvariantsize.rawAddress, propvariantpointer.rawAddress, remappedtype.rawAddress)

public actual fun propertiesListCopy(target: MutPtr<SensorPropertyList>, source: ConstPtr<SensorPropertyList>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress, source.rawAddress)

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr<SensorCollectionList>, pkey: MutPtr<Propertykey>, pvalue: MutPtr<Propvariant>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index.toInt(), psensorslist.rawAddress, pkey.rawAddress, pvalue.rawAddress)

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes.toInt(), pbuffer.rawAddress)

public actual fun serializationBufferFree(buffer: ConstPtr<UByte>) {
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress)
}
