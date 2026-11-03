package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT

public fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListAllocateBufferAndSerialize", longArrayOf(sourcecollection, ptargetbuffersizeinbytes, ptargetbuffer))
    return Foundation.NTSTATUS()
}

public fun CollectionsListCopyAndMarshall(target: Long, source: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListCopyAndMarshall", longArrayOf(target, source))
    return Foundation.NTSTATUS()
}

public fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListDeserializeFromBuffer", longArrayOf(sourcebuffersizeinbytes.toLong(), sourcebuffer, targetcollection))
    return Foundation.NTSTATUS()
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

public fun CollectionsListMarshall(target: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListMarshall", longArrayOf(target))
    return Foundation.NTSTATUS()
}

public fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListSerializeToBuffer", longArrayOf(sourcecollection, targetbuffersizeinbytes.toLong(), targetbuffer))
    return Foundation.NTSTATUS()
}

public fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListSortSubscribedActivitiesByConfidence", longArrayOf(thresholds, pcollection))
    return Foundation.NTSTATUS()
}

public fun CollectionsListUpdateMarshalledPointer(collection: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "CollectionsListUpdateMarshalledPointer", longArrayOf(collection))
    return Foundation.NTSTATUS()
}

public fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "EvaluateActivityThresholds", longArrayOf(newsample, oldsample, thresholds))
    return (rawRet and 0xFFL) != 0L
}

public fun GetPerformanceTime(timems: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "GetPerformanceTime", longArrayOf(timems))
    return Foundation.NTSTATUS()
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
    val rawRet = Win32DynamicFfi.invoke("sensorsutilsv2.dll", "IsSensorSubscribed", longArrayOf(subscriptionlist, Win32DynamicFfi.guidSlot(currenttype.data1, currenttype.data2, currenttype.data3, currenttype.data4)))
    return (rawRet and 0xFFL) != 0L
}

public fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetBool", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetDouble", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetFileTime", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetFloat", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetGuid", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetInt32", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetInt64", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetNthInt64", longArrayOf(plist, pkey, occurrence.toLong(), pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetNthUlong", longArrayOf(plist, pkey, occurrence.toLong(), pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetNthUshort", longArrayOf(plist, pkey, occurrence.toLong(), pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetPropVariant", longArrayOf(plist, pkey, if (typecheck) 1L else 0L, pvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetUlong", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeyGetUshort", longArrayOf(plist, pkey, pretvalue))
    return Foundation.NTSTATUS()
}

public fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropKeyFindKeySetPropVariant", longArrayOf(plist, pkey, if (typecheck) 1L else 0L, pvalue))
    return Foundation.NTSTATUS()
}

public fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropVariantGetInformation", longArrayOf(propvariantvalue, propvariantoffset, propvariantsize, propvariantpointer, remappedtype))
    return Foundation.NTSTATUS()
}

public fun PropertiesListCopy(target: Long, source: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropertiesListCopy", longArrayOf(target, source))
    return Foundation.NTSTATUS()
}

public fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt {
    return Win32DynamicFfi.invoke("sensorsutilsv2.dll", "PropertiesListGetFillableCount", longArrayOf(buffersizebytes.toLong())).toUInt()
}

public fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "SensorCollectionGetAt", longArrayOf(index.toLong(), psensorslist, pkey, pvalue))
    return Foundation.NTSTATUS()
}

public fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "SerializationBufferAllocate", longArrayOf(sizeinbytes.toLong(), pbuffer))
    return Foundation.NTSTATUS()
}

public fun SerializationBufferFree(buffer: Long) {
    Win32DynamicFfi.invoke("sensorsutilsv2.dll", "SerializationBufferFree", longArrayOf(buffer))
}
