�GSN    �̅9��N79/H
7Qo067b���{b�71���Yh>����R��k��a�zq�rg.3�w(9J=w���[u��eL��*�W�Zm���ԕvɈ��u2�f[�}u�<�X'��6SS	�,�&M$Z��l�q�Cw���A�4>K��f������z���1ؿ���w:3{�����"6��i}�#8�δď݋=��M����Pa 8�������.h�!z"7����BN����q�Ky&?$������?f��l��=X�JDG�ж���P�*�o�䯑Cף��r��&�n��EA.��`�SYHx�r��E�Ҝ�mh�9��<O�Nf�r��>w;���9�8�U����b�0{�<k���Z���.'��I�Sq�P�9�����B��{�g�Rω��x:M����<������waP��e�S6F��cє��=á�����p���|0���~Um;�&J�0�e�gVsA+ő�ڴv
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabled�
	gl_FragColor = vec4(color, alpha);
}

