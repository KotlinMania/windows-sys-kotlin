#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(void* rgpropvar, uint32_t cvars);
int32_t windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, uint32_t grfmode, void* pwszname, uint32_t dwcount, void* presults);
int32_t windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, void* pstg, uint32_t dwcount, void* presults);
int32_t windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(void* pstm, void* iid, void* ppv);
int32_t windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* pplkbyt);
int32_t windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* ppstm);
int32_t windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(void* pfmtid, void* oszname);
int32_t windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(uint32_t cvariants, void* rgvars);
int32_t windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(void* pstg);
int32_t windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(void* plkbyt, void* phglobal);
int32_t windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(void* pstm, void* phglobal);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(void* prgf, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(void* pv, uint32_t cb, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(void* clsid, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(void* pftin, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(void* prgft, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(void* guid, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(void* propvarin, uint32_t ielem, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(void* hinst, uint32_t id, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(void* psz, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(void* prgsz, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(void* prgn, uint32_t celems, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(void* propvarsingle, void* ppropvarvector);
int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(void* pstg, void* lpolestream);
int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(void* pstg, uint16_t cfformat, int32_t lwidth, int32_t lheight, uint32_t dwsize, void* pmedium, void* polestm);
int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(void* lpolestream, void* pstg, void* ptd);
int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(void* polestm, void* pstg, void* pcfformat, void* plwwidth, void* plheight, void* pdwsize, void* pmedium);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(void* oszname, void* pfmtid);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(void* ppropvardest, void* propvarsrc, int32_t flags, uint16_t vt);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(void* pvar);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(void* propvar1, void* propvar2, int32_t unit, int32_t flags);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(void* pvardest, void* pvarsrc);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(void* propvar, uint32_t ielem, void* pfval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(void* propvar, uint32_t ielem, void* pnval);
uint32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(void* propvar);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(void* propvar, uint32_t ielem, void* pftval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(void* propvar, uint32_t ielem, void* ppszval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(void* propvar, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(void* propvar, void* pbstrout);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(void* propvarin, void* pfret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(void* propvar, void* prgf, uint32_t crgf, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(void* propvar, void* pprgf, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(void* propvarin, int32_t fdefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(void* propvar, void* pv, uint32_t cb);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(void* propvarin, void* pdblret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(void* propvar, void* pprgn, void* pcelem);
double windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(void* propvarin, double dbldefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(void* propvar, int32_t pstfout, void* pftout);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(void* propvar, void* prgft, uint32_t crgft, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(void* propvar, void* pprgft, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(void* propvar, void* pguid);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(void* propvarin, void* piret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int16_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(void* propvarin, int16_t idefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(void* propvarin, void* plret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(void* propvarin, int32_t ldefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(void* propvarin, void* pllret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem);
int64_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(void* propvarin, int64_t lldefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(void* propvar, void* psz, uint32_t cch);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(void* propvar, void* ppszout);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(void* propvar, void* prgsz, uint32_t crgsz, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(void* propvar, void* pprgsz, void* pcelem);
void* windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(void* propvarin, void* pszdefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(void* propvarin, void* puiret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint16_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(void* propvarin, uint16_t uidefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(void* propvarin, void* pulret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(void* propvarin, uint32_t uldefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(void* propvarin, void* pullret);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem);
uint64_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(void* propvarin, uint64_t ulldefault);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(void* ppropvar, void* pvar);
int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(void* propvar, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemComStructuredstorageReadClassStg(void* pstg, void* pclsid);
int32_t windowssysWindowsWin32SystemComStructuredstorageReadClassStm(void* pstm, void* pclsid);
int32_t windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(void* pstg, void* pcf, void* lplpszusertype);
int32_t windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(void* pstg, int32_t fconvert);
bool windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(void* pprop, uint16_t codepage, void* pvar, void* pma);
void* windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(void* pvar, uint16_t codepage, void* pprop, void* pcb, uint32_t pid, bool freserved, void* pcindirect);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(void* pwcsname, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(void* plkbyt, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(void* pstorage, uint32_t dwreserved, void* pppropsetstg);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(void* punk, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(void* pprop, uint32_t cbmax, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(void* pwcsname, void* ppflb);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(void* pilb, void* ppflb);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(void* pwcsname);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(void* plkbyt);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(void* pflb, uint32_t grfmode, uint32_t asyncflags, void* ppstgopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(void* pwcsdfname, uint32_t grfmode, uint32_t reserved, void* ppstgopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(void* punk, void* fmtid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(void* pwcsname, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(void* plkbyt, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen);
uint32_t windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(void* pprop, uint32_t cbprop, uint16_t codepage, uint8_t breserved);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(void* ppropvar, void* ppprop, void* pcb);
int32_t windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(void* lpszname, void* pctime, void* patime, void* pmtime);
int32_t windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(void* pvar, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(void* punkpropertyvalue, void* ppropvar);
int32_t windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(void* pstg, void* rclsid);
int32_t windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(void* pstm, void* rclsid);
int32_t windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(void* pstg, uint16_t cf, void* lpszusertype);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WINDOWS_WIN32_SYSTEM_COM_STRUCTUREDSTORAGE_WRAPPER_H */
