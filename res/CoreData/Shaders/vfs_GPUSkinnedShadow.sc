�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�?zw/$צ�v�u����0W�C�}�����iΑ��rj�(�Yn�$�j+���PU�X�P9�K�o�s�(�����O�2PšF(������fʨ��$��1��RJP4�J����~*6��AC�৹ə޹\z��J��:��="8#�릷є��6k�);7d���� eE����R�E<3#������#h��j��2r�lLX���Ꮪ0��c�c׾ɻn2�䊇s�3��^(��ZCx�w�So}�m)�k�^����ko�k��_�o�]V�z��>ir����}�����rV�Yo�iR���ܢ��h)#���-d�wd�^����H��U���Vk���z��RbRQ��N��4���=���83J+Ή7�8qk��l����.�يV����zҫ�J<��ߗ.j:S�&�? �t�|   <�����{edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Posit�on.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm<n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
