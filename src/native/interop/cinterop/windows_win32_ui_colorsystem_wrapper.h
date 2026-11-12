#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssysWindowsWin32UiColorsystemCMCheckColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lparesult);
int32_t windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(int64_t hcmtransform, void* lpargbtriple, void* lparesult, uint32_t ncount);
int32_t windowssysWindowsWin32UiColorsystemCMCheckRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lparesult, void* pfncallback, int64_t ulcallbackdata);
int32_t windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount);
int32_t windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount);
int32_t windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags, void* lpprofiledata);
int64_t windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags);
int32_t windowssysWindowsWin32UiColorsystemCMCreateProfile(void* lpcolorspace, void* lpprofiledata);
int32_t windowssysWindowsWin32UiColorsystemCMCreateProfileW(void* lpcolorspace, void* lpprofiledata);
int64_t windowssysWindowsWin32UiColorsystemCMCreateTransform(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter);
int64_t windowssysWindowsWin32UiColorsystemCMCreateTransformExt(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags);
int64_t windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags);
int64_t windowssysWindowsWin32UiColorsystemCMCreateTransformW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter);
int32_t windowssysWindowsWin32UiColorsystemCMDeleteTransform(int64_t hcmtransform);
uint32_t windowssysWindowsWin32UiColorsystemCMGetInfo(uint32_t dwinfo);
int32_t windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo);
int32_t windowssysWindowsWin32UiColorsystemCMIsProfileValid(int64_t hprofile, void* lpbvalid);
int32_t windowssysWindowsWin32UiColorsystemCMTranslateColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lpaoutputcolors, int32_t ctoutput);
int32_t windowssysWindowsWin32UiColorsystemCMTranslateRGB(int64_t hcmtransform, uint32_t colorref, void* lpcolorref, uint32_t dwflags);
int32_t windowssysWindowsWin32UiColorsystemCMTranslateRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lpdestbits, int32_t bmoutput, uint32_t dwtranslatedirection);
int32_t windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* lpdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* lpfncallback, int64_t ulcallbackdata);
int32_t windowssysWindowsWin32UiColorsystemCheckBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* paresult, void* pfncallback, int64_t lpcallbackdata);
int32_t windowssysWindowsWin32UiColorsystemCheckColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paresult);
int32_t windowssysWindowsWin32UiColorsystemCheckColorsInGamut(void* hdc, void* lprgbtriple, void* dlpbuffer, uint32_t ncount);
int32_t windowssysWindowsWin32UiColorsystemCloseColorProfile(int64_t hprofile);
int32_t windowssysWindowsWin32UiColorsystemColorCorrectPalette(void* hdc, void* hpal, uint32_t defirst, uint32_t num);
int32_t windowssysWindowsWin32UiColorsystemColorMatchToTarget(void* hdc, void* hdctarget, uint32_t action);
int32_t windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount);
int32_t windowssysWindowsWin32UiColorsystemConvertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount);
void* windowssysWindowsWin32UiColorsystemCreateColorSpaceA(void* lplcs);
void* windowssysWindowsWin32UiColorsystemCreateColorSpaceW(void* lplcs);
int64_t windowssysWindowsWin32UiColorsystemCreateColorTransformA(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags);
int64_t windowssysWindowsWin32UiColorsystemCreateColorTransformW(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags);
int32_t windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(void* hprofile, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, void* pprofiledata, uint32_t indexpreferredcmm);
int64_t windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, uint32_t indexpreferredcmm);
int32_t windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(void* plogcolorspace, void* pprofile);
int32_t windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(void* plogcolorspace, void* pprofile);
int32_t windowssysWindowsWin32UiColorsystemDeleteColorSpace(void* hcs);
int32_t windowssysWindowsWin32UiColorsystemDeleteColorTransform(int64_t hxform);
int32_t windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssysWindowsWin32UiColorsystemEnumColorProfilesA(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles);
int32_t windowssysWindowsWin32UiColorsystemEnumColorProfilesW(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles);
int32_t windowssysWindowsWin32UiColorsystemEnumICMProfilesA(void* hdc, void* proc, int64_t param2);
int32_t windowssysWindowsWin32UiColorsystemEnumICMProfilesW(void* hdc, void* proc, int64_t param2);
uint32_t windowssysWindowsWin32UiColorsystemGetCMMInfo(int64_t hcolortransform, uint32_t param1);
int32_t windowssysWindowsWin32UiColorsystemGetColorDirectoryA(void* pmachinename, void* pbuffer, void* pdwsize);
int32_t windowssysWindowsWin32UiColorsystemGetColorDirectoryW(void* pmachinename, void* pbuffer, void* pdwsize);
int32_t windowssysWindowsWin32UiColorsystemGetColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement, void* pbreference);
int32_t windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(int64_t hprofile, uint32_t dwindex, void* ptag);
int32_t windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(int64_t hprofile, void* pprofile, void* pcbprofile);
int32_t windowssysWindowsWin32UiColorsystemGetColorProfileHeader(int64_t hprofile, void* pheader);
void* windowssysWindowsWin32UiColorsystemGetColorSpace(void* hdc);
int32_t windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(int64_t hprofile, void* pnelementcount);
int32_t windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(void* hdc, void* lpramp);
int32_t windowssysWindowsWin32UiColorsystemGetICMProfileA(void* hdc, void* pbufsize, void* pszfilename);
int32_t windowssysWindowsWin32UiColorsystemGetICMProfileW(void* hdc, void* pbufsize, void* pszfilename);
int32_t windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(void* hcolorspace, void* lpbuffer, uint32_t nsize);
int32_t windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(void* hcolorspace, void* lpbuffer, uint32_t nsize);
int32_t windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo);
int32_t windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(int64_t hprofile, uint32_t dwintent, void* pps2colorrenderingdictionary, void* pcbps2colorrenderingdictionary, void* pbbinary);
int32_t windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(int64_t hprofile, uint32_t dwintent, void* pbuffer, void* pcbps2colorrenderingintent);
int32_t windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(int64_t hprofile, uint32_t dwintent, uint32_t dwcsatype, void* pps2colorspacearray, void* pcbps2colorspacearray, void* pbbinary);
int32_t windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize);
int32_t windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize);
int32_t windowssysWindowsWin32UiColorsystemInstallColorProfileA(void* pmachinename, void* pprofilename);
int32_t windowssysWindowsWin32UiColorsystemInstallColorProfileW(void* pmachinename, void* pprofilename);
int32_t windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(int64_t hprofile, uint32_t tag, void* pbpresent);
int32_t windowssysWindowsWin32UiColorsystemIsColorProfileValid(int64_t hprofile, void* pbvalid);
int64_t windowssysWindowsWin32UiColorsystemOpenColorProfileA(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode);
int64_t windowssysWindowsWin32UiColorsystemOpenColorProfileW(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode);
int32_t windowssysWindowsWin32UiColorsystemRegisterCMMA(void* pmachinename, uint32_t cmmid, void* pcmmdll);
int32_t windowssysWindowsWin32UiColorsystemRegisterCMMW(void* pmachinename, uint32_t cmmid, void* pcmmdll);
int32_t windowssysWindowsWin32UiColorsystemSelectCMM(uint32_t dwcmmtype);
int32_t windowssysWindowsWin32UiColorsystemSetColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement);
int32_t windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(int64_t hprofile, uint32_t newtag, uint32_t reftag);
int32_t windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(int64_t hprofile, uint32_t tagtype, uint32_t pcbelement);
int32_t windowssysWindowsWin32UiColorsystemSetColorProfileHeader(int64_t hprofile, void* pheader);
void* windowssysWindowsWin32UiColorsystemSetColorSpace(void* hdc, void* hcs);
int32_t windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(void* hdc, void* lpramp);
int32_t windowssysWindowsWin32UiColorsystemSetICMMode(void* hdc, int32_t mode);
int32_t windowssysWindowsWin32UiColorsystemSetICMProfileA(void* hdc, void* lpfilename);
int32_t windowssysWindowsWin32UiColorsystemSetICMProfileW(void* hdc, void* lpfilename);
int32_t windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(void* pmachinename, uint32_t dwprofileid, void* pprofilename);
int32_t windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(void* pmachinename, uint32_t dwprofileid, void* pprofilename);
int32_t windowssysWindowsWin32UiColorsystemSetupColorMatchingA(void* pcms);
int32_t windowssysWindowsWin32UiColorsystemSetupColorMatchingW(void* pcms);
int32_t windowssysWindowsWin32UiColorsystemTranslateBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* pdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* pfncallback, int64_t ulcallbackdata);
int32_t windowssysWindowsWin32UiColorsystemTranslateColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paoutputcolors, int32_t ctoutput);
int32_t windowssysWindowsWin32UiColorsystemUninstallColorProfileA(void* pmachinename, void* pprofilename, int32_t bdelete);
int32_t windowssysWindowsWin32UiColorsystemUninstallColorProfileW(void* pmachinename, void* pprofilename, int32_t bdelete);
int32_t windowssysWindowsWin32UiColorsystemUnregisterCMMA(void* pmachinename, uint32_t cmmid);
int32_t windowssysWindowsWin32UiColorsystemUnregisterCMMW(void* pmachinename, uint32_t cmmid);
int32_t windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command);
int32_t windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command);
int32_t windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(int32_t scope, void* pprofilename, void* pdevicename);
int32_t windowssysWindowsWin32UiColorsystemWcsCheckColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, void* paresult);
int64_t windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(int64_t hwcsprofile, uint32_t dwoptions);
int32_t windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(int32_t scope, void* pprofilename, void* pdevicename);
int32_t windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(int32_t scope, void* penumrecord, void* pbuffer, uint32_t dwsize, void* pnprofiles);
int32_t windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(int32_t scope, void* penumrecord, void* pdwsize);
int32_t windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(void* pbisenabled);
int32_t windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, uint32_t cbprofilename, void* pprofilename);
int32_t windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pcbprofilename);
int32_t windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(int32_t scope, void* pdwrenderingintent);
int32_t windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, void* puseperuserprofiles);
int64_t windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags);
int64_t windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags);
int32_t windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(int32_t bisenabled);
int32_t windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pprofilename);
int32_t windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(int32_t scope, uint32_t dwrenderingintent);
int32_t windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, int32_t useperuserprofiles);
int32_t windowssysWindowsWin32UiColorsystemWcsTranslateColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, uint32_t noutputchannels, int32_t cdtoutput, uint32_t cboutput, void* poutputdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H */
