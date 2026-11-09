@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): NTSTATUS =
    0

public actual fun CollectionsListCopyAndMarshall(target: Long, source: Long): NTSTATUS =
    0

public actual fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): NTSTATUS =
    0

public actual fun CollectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    0u

public actual fun CollectionsListGetMarshalledSize(collection: Long): UInt =
    0u

public actual fun CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): UInt =
    0u

public actual fun CollectionsListGetSerializedSize(collection: Long): UInt =
    0u

public actual fun CollectionsListMarshall(target: Long): NTSTATUS =
    0

public actual fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): NTSTATUS =
    0

public actual fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): NTSTATUS =
    0

public actual fun CollectionsListUpdateMarshalledPointer(collection: Long): NTSTATUS =
    0

public actual fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean =
    false

public actual fun GetPerformanceTime(timems: Long): NTSTATUS =
    0

public actual fun InitPropVariantFromCLSIDArray(members: Long, size: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromFloat(fltval: Float, ppropvar: Long): HRESULT =
    0

public actual fun IsCollectionListSame(lista: Long, listb: Long): Boolean =
    false

public actual fun IsGUIDPresentInList(guidarray: Long, arraylength: UInt, guidelem: Long): Boolean =
    false

public actual fun IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean =
    false

public actual fun IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean =
    false

public actual fun IsSensorSubscribed(subscriptionlist: Long, currenttype: GUID): Boolean =
    false

public actual fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    0

public actual fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    0

public actual fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): NTSTATUS =
    0

public actual fun PropertiesListCopy(target: Long, source: Long): NTSTATUS =
    0

public actual fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    0u

public actual fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): NTSTATUS =
    0

public actual fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): NTSTATUS =
    0

public actual fun SerializationBufferFree(buffer: Long) {
}
