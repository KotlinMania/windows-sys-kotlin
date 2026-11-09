package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): NTSTATUS

public expect fun CollectionsListCopyAndMarshall(target: Long, source: Long): NTSTATUS

public expect fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): NTSTATUS

public expect fun CollectionsListGetFillableCount(buffersizebytes: UInt): UInt

public expect fun CollectionsListGetMarshalledSize(collection: Long): UInt

public expect fun CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): UInt

public expect fun CollectionsListGetSerializedSize(collection: Long): UInt

public expect fun CollectionsListMarshall(target: Long): NTSTATUS

public expect fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): NTSTATUS

public expect fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): NTSTATUS

public expect fun CollectionsListUpdateMarshalledPointer(collection: Long): NTSTATUS

public expect fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean

public expect fun GetPerformanceTime(timems: Long): NTSTATUS

public expect fun InitPropVariantFromCLSIDArray(members: Long, size: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromFloat(fltval: Float, ppropvar: Long): HRESULT

public expect fun IsCollectionListSame(lista: Long, listb: Long): Boolean

public expect fun IsGUIDPresentInList(guidarray: Long, arraylength: UInt, guidelem: Long): Boolean

public expect fun IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean

public expect fun IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean

public expect fun IsSensorSubscribed(subscriptionlist: Long, currenttype: GUID): Boolean

public expect fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS

public expect fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS

public expect fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): NTSTATUS

public expect fun PropertiesListCopy(target: Long, source: Long): NTSTATUS

public expect fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt

public expect fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): NTSTATUS

public expect fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): NTSTATUS

public expect fun SerializationBufferFree(buffer: Long)
