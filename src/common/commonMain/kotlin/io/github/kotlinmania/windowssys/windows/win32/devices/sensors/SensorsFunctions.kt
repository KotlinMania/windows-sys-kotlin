package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListAllocateBufferAndSerialize", longArrayOf(sourcecollection, ptargetbuffersizeinbytes, ptargetbuffer)).toInt()
}

public fun CollectionsListCopyAndMarshall(target: Long, source: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListCopyAndMarshall", longArrayOf(target, source)).toInt()
}

public fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListDeserializeFromBuffer", longArrayOf(sourcebuffersizeinbytes.toLong(), sourcebuffer, targetcollection)).toInt()
}

public fun CollectionsListGetFillableCount(buffersizebytes: UInt): UInt {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListGetFillableCount", longArrayOf(buffersizebytes.toLong())).toUInt()
}

public fun CollectionsListGetMarshalledSize(collection: Long): UInt {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListGetMarshalledSize", longArrayOf(collection)).toUInt()
}

public fun CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): UInt {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListGetMarshalledSizeWithoutSerialization", longArrayOf(collection)).toUInt()
}

public fun CollectionsListGetSerializedSize(collection: Long): UInt {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListGetSerializedSize", longArrayOf(collection)).toUInt()
}

public fun CollectionsListMarshall(target: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListMarshall", longArrayOf(target)).toInt()
}

public fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListSerializeToBuffer", longArrayOf(sourcecollection, targetbuffersizeinbytes.toLong(), targetbuffer)).toInt()
}

public fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListSortSubscribedActivitiesByConfidence", longArrayOf(thresholds, pcollection)).toInt()
}

public fun CollectionsListUpdateMarshalledPointer(collection: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListUpdateMarshalledPointer", longArrayOf(collection)).toInt()
}

public fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "EvaluateActivityThresholds", longArrayOf(newsample, oldsample, thresholds))
    return (rawRet and 0xFFL) != 0L
}

public fun GetPerformanceTime(timems: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "GetPerformanceTime", longArrayOf(timems)).toInt()
}

public fun InitPropVariantFromCLSIDArray(members: Long, size: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "InitPropVariantFromCLSIDArray", longArrayOf(members, size.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromFloat(fltval: Float, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("sensorsutilsv2.dll", "InitPropVariantFromFloat", 1, false, longArrayOf((fltval.toRawBits().toLong() and 0xFFFF_FFFFL), ppropvar)).toLong().toInt()
}

public fun IsCollectionListSame(lista: Long, listb: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "IsCollectionListSame", longArrayOf(lista, listb))
    return (rawRet and 0xFFL) != 0L
}

public fun IsGUIDPresentInList(guidarray: Long, arraylength: UInt, guidelem: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "IsGUIDPresentInList", longArrayOf(guidarray, arraylength.toLong(), guidelem))
    return (rawRet and 0xFFL) != 0L
}

public fun IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "IsKeyPresentInCollectionList", longArrayOf(plist, pkey))
    return (rawRet and 0xFFL) != 0L
}

public fun IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "IsKeyPresentInPropertyList", longArrayOf(plist, pkey))
    return (rawRet and 0xFFL) != 0L
}

public fun IsSensorSubscribed(subscriptionlist: Long, currenttype: GUID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "IsSensorSubscribed", longArrayOf(subscriptionlist, run { val buf = ByteArray(16); buf[0] = (currenttype.data1.toInt() and 0xFF).toByte(); buf[1] = ((currenttype.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((currenttype.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((currenttype.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (currenttype.data2.toInt() and 0xFF).toByte(); buf[5] = ((currenttype.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (currenttype.data3.toInt() and 0xFF).toByte(); buf[7] = ((currenttype.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, currenttype.data4.size)) buf[8 + i] = currenttype.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }))
    return (rawRet and 0xFFL) != 0L
}

public fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetBool", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetDouble", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetFileTime", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetFloat", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetGuid", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetInt32", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetInt64", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetNthInt64", longArrayOf(plist, pkey, occurrence.toLong(), pretvalue)).toInt()
}

public fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetNthUlong", longArrayOf(plist, pkey, occurrence.toLong(), pretvalue)).toInt()
}

public fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetNthUshort", longArrayOf(plist, pkey, occurrence.toLong(), pretvalue)).toInt()
}

public fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetPropVariant", longArrayOf(plist, pkey, if (typecheck) 1L else 0L, pvalue)).toInt()
}

public fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetUlong", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetUshort", longArrayOf(plist, pkey, pretvalue)).toInt()
}

public fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeySetPropVariant", longArrayOf(plist, pkey, if (typecheck) 1L else 0L, pvalue)).toInt()
}

public fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropVariantGetInformation", longArrayOf(propvariantvalue, propvariantoffset, propvariantsize, propvariantpointer, remappedtype)).toInt()
}

public fun PropertiesListCopy(target: Long, source: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropertiesListCopy", longArrayOf(target, source)).toInt()
}

public fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropertiesListGetFillableCount", longArrayOf(buffersizebytes.toLong())).toUInt()
}

public fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "SensorCollectionGetAt", longArrayOf(index.toLong(), psensorslist, pkey, pvalue)).toInt()
}

public fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "SerializationBufferAllocate", longArrayOf(sizeinbytes.toLong(), pbuffer)).toInt()
}

public fun SerializationBufferFree(buffer: Long) {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "SerializationBufferFree", longArrayOf(buffer))
}
