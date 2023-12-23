import { ReactElement, useState } from "react";
import TextField from '@mui/material/TextField';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import { useTranslation } from 'react-i18next';
type Props = {
    onSearch: (query: string) => void
}

const Search: React.FC<Props> = (props: Props): ReactElement => {
    
    const [value, setValue] = useState('');
    const {t} = useTranslation();
    const search = () => {
        props.onSearch(value);
    }

    //Edit
    return (
        <div>
            <Box
                sx={{
                    marginTop: 2,
                    display: 'flex',
                    flexDirection: 'row',
                    alignItems: 'center',
                    justifyContent: 'center',
                }}  
            >
                <TextField
                    type="text"
                    onChange={(e) => setValue(e.target.value)}
                    placeholder="Title,Tags,Ingredients,Description"
                    margin="normal"
                    required
                    fullWidth
                    label={t('Search')}
                    name="search"
                    autoFocus
                    sx={{ width: '50%', marginRight: '10px'}}
                />
                <Button
                    variant="contained"
                    onClick={search}
                    sx={{
                        mt: 2,
                        mb: 2,
                        // width: '30%',
                        backgroundColor: '#1EAE69',
                        display: 'block',
                    }}
                >
                    {t('Search')}
                </Button>
            </Box>
        </div>
    );
};

export default Search;