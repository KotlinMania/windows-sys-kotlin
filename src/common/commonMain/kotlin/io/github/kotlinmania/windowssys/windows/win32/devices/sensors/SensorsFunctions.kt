package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun collectionsListAllocateBufferAndSerialize(sourcecollection: COpaquePointer?, ptargetbuffersizeinbytes: COpaquePointer?, ptargetbuffer: COpaquePointer?): Ntstatus

public expect fun collectionsListCopyAndMarshall(target: COpaquePointer?, source: COpaquePointer?): Ntstatus

public expect fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: COpaquePointer?, targetcollection: COpaquePointer?): Ntstatus

public expect fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt

public expect fun collectionsListGetMarshalledSize(collection: COpaquePointer?): UInt

public expect fun collectionsListGetMarshalledSizeWithoutSerialization(collection: COpaquePointer?): UInt

public expect fun collectionsListGetSerializedSize(collection: COpaquePointer?): UInt

public expect fun collectionsListMarshall(target: COpaquePointer?): Ntstatus

public expect fun collectionsListSerializeToBuffer(sourcecollection: COpaquePointer?, targetbuffersizeinbytes: UInt, targetbuffer: COpaquePointer?): Ntstatus

public expect fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: COpaquePointer?, pcollection: COpaquePointer?): Ntstatus

public expect fun collectionsListUpdateMarshalledPointer(collection: COpaquePointer?): Ntstatus

public expect fun evaluateActivityThresholds(newsample: COpaquePointer?, oldsample: COpaquePointer?, thresholds: COpaquePointer?): Boolean

public expect fun getPerformanceTime(timems: COpaquePointer?): Ntstatus

public expect fun initPropVariantFromCLSIDArray(members: COpaquePointer?, size: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromFloat(fltval: Float, ppropvar: COpaquePointer?): Hresult

public expect fun isCollectionListSame(lista: COpaquePointer?, listb: COpaquePointer?): Boolean

public expect fun isGUIDPresentInList(guidarray: COpaquePointer?, arraylength: UInt, guidelem: COpaquePointer?): Boolean

public expect fun isKeyPresentInCollectionList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean

public expect fun isKeyPresentInPropertyList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean

public expect fun isSensorSubscribed(subscriptionlist: COpaquePointer?, currenttype: Guid): Boolean

public expect fun propKeyFindKeyGetBool(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetDouble(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetFileTime(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetFloat(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetGuid(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetInt32(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetInt64(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetNthInt64(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetNthUlong(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetNthUshort(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetUlong(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeyGetUshort(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus

public expect fun propKeyFindKeySetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus

public expect fun propVariantGetInformation(propvariantvalue: COpaquePointer?, propvariantoffset: COpaquePointer?, propvariantsize: COpaquePointer?, propvariantpointer: COpaquePointer?, remappedtype: COpaquePointer?): Ntstatus

public expect fun propertiesListCopy(target: COpaquePointer?, source: COpaquePointer?): Ntstatus

public expect fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt

public expect fun sensorCollectionGetAt(index: UInt, psensorslist: COpaquePointer?, pkey: COpaquePointer?, pvalue: COpaquePointer?): Ntstatus

public expect fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: COpaquePointer?): Ntstatus

public expect fun serializationBufferFree(buffer: COpaquePointer?)
